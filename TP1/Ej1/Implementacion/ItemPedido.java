public class ItemPedido {
    private Articulo articulo;
    private int cantidad;
    private double precioUnitario;

    public ItemPedido(Articulo articulo, int cantidad, double precioUnitario) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return cantidad * precioUnitario;
    }
}
