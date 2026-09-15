public class Entregado implements EstadoPedido {

    @Override
    public void agregarArticulo(Pedido pedido, Articulo articulo, int cantidad, double precioUnitario) {
        throw new IllegalStateException("El pedido ya está ENTREGADO: no admite modificaciones.");
    }

    @Override
    public void agregarRemito(Pedido pedido, Remito remito) {
        throw new IllegalStateException("El pedido ya está ENTREGADO: no admite nuevos remitos.");
    }

    @Override
    public void reabrir(Pedido pedido) {
        throw new IllegalStateException("No se puede reabrir un pedido que ya fue ENTREGADO.");
    }
}
