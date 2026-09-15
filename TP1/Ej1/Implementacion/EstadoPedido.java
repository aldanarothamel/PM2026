public interface EstadoPedido {
    void agregarArticulo(Pedido pedido, Articulo articulo, int cantidad, double precioUnitario);
    void agregarRemito(Pedido pedido, Remito remito);
    void reabrir(Pedido pedido);
}
