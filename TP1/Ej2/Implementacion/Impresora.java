public class Impresora {
    private final String nombre;
    private boolean enUso;

    public Impresora(String nombre) {
        this.nombre = nombre;
        this.enUso = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEnUso() {
        return enUso;
    }

    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }

    public void imprimir(String documento) {
        System.out.println("Imprimiendo en [" + nombre + "]: " + documento);
    }
}
