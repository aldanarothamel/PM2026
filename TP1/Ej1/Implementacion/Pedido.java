import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private LocalDate fechaEntrega;
    private Cliente cliente;
    private List<ItemPedido> articulos;
    private List<Remito> remitos;
    private EstadoPedido estado;

    public Pedido(int numero, LocalDate fechaEntrega, Cliente cliente) {
        this.numero = numero;
        this.fechaEntrega = fechaEntrega;
        this.cliente = cliente;
        this.articulos = new ArrayList<>();
        this.remitos = new ArrayList<>();
        this.estado = new Abierto(); // Estado inicial
    }

    // ==========================================
    // Métodos solicitados en el Punto B
    // ==========================================

    public void agregarArticulo(Articulo articulo, int cantidad, double precioUnitario) {
        this.estado.agregarArticulo(this, articulo, cantidad, precioUnitario);
    }

    public void agregarRemito(Remito remito) {
        this.estado.agregarRemito(this, remito);
    }

    // ==========================================
    // Método solicitado en el Punto C
    // ==========================================

    public void reabrir() {
        this.estado.reabrir(this);
    }

    // Transiciones y accesores de estado
    public void cerrar() {
        this.setEstado(new Cerrado());
    }

    public void entregar() {
        this.setEstado(new Entregado());
    }

    public void setEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public List<ItemPedido> getArticulos() {
        return articulos;
    }

    public List<Remito> getRemitos() {
        return remitos;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
