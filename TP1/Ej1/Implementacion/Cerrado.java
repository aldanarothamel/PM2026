public class Cerrado implements EstadoPedido {

    @Override
    public void agregarArticulo(Pedido pedido, Articulo articulo, int cantidad, double precioUnitario) {
        // En estado cerrado NO se permiten artículos
        throw new IllegalStateException("No se pueden agregar artículos a un pedido CERRADO.");
    }

    @Override
    public void agregarRemito(Pedido pedido, Remito remito) {
        // En estado cerrado sí se permiten remitos
        pedido.getRemitos().add(remito);
    }

    @Override
    public void reabrir(Pedido pedido) {
        // Punto C: Modificación para reabrir el pedido
        pedido.setEstado(new Abierto());
    }
}
