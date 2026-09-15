import java.util.ArrayList;
import java.util.List;

public class PoolImpresoras {

    // Variable estática que almacena la única instancia (Singleton)
    private static PoolImpresoras instancia;

    // Colección para gestionar los recursos administrados (Object Pool)
    private final List<Impresora> impresoras;

    // Constructor privado: impide la creación de instancias con 'new' desde afuera
    private PoolImpresoras() {
        this.impresoras = new ArrayList<>();
    }

    /**
     * Método estático global para obtener la única instancia del Pool.
     * Implementa 'Lazy Initialization' con soporte seguro para hilos (Thread-safe).
     */
    public static synchronized PoolImpresoras getInstancia() {
        if (instancia == null) {
            instancia = new PoolImpresoras();
        }
        return instancia;
    }

    /**
     * Busca y retorna una impresora por nombre siempre y cuando exista y no esté en uso.
     */
    public synchronized Impresora obtenerImpresora(String nombre) {
        for (Impresora impresora : impresoras) {
            if (impresora.getNombre().equalsIgnoreCase(nombre)) {
                if (impresora.isEnUso()) {
                    throw new IllegalStateException("La impresora '" + nombre + "' ya se encuentra en uso.");
                }
                impresora.setEnUso(true);
                return impresora;
            }
        }
        throw new IllegalArgumentException("No se encontró ninguna impresora con el nombre: " + nombre);
    }

    /**
     * Libera una impresora previamente solicitada para que vuelva a estar disponible.
     */
    public synchronized void liberarImpresora(Impresora impresora) {
        if (impresora == null) {
            throw new IllegalArgumentException("No se puede liberar un objeto nulo.");
        }

        if (impresoras.contains(impresora)) {
            impresora.setEnUso(false);
        } else {
            throw new IllegalArgumentException("La impresora provista no pertenece a este pool.");
        }
    }

    /**
     * Permite cargar impresoras al inventario del Pool.
     */
    public synchronized void registrarImpresora(Impresora impresora) {
        if (impresora != null && !impresoras.contains(impresora)) {
            impresoras.add(impresora);
        }
    }
}
