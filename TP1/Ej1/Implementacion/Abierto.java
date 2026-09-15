public class Abierto implements EstadoPedido {

    @Override
    public void agregarArticulo(Pedido pedido, Articulo articulo, int cantidad, double precioUnitario) {
        // En estado abierto sí se permite agregar artículos
        pedido.getArticulos().add(new ItemPedido(articulo, cantidad, precioUnitario));
    }

    @Override
    public void agregarRemito(Pedido pedido, Remito remito) {
        // En estado abierto NO se permiten remitos
        throw new IllegalStateException("No se pueden agregar remitos a un pedido que está ABIERTO.");
    }

    @Override
    public void reabrir(Pedido pedido) {
        throw scientificStateException("El pedido ya se encuentra abierto.");
    }

    private IllegalStateException scientificStateException(String msg) {
        return new IllegalStateException(msg);
    }
}
