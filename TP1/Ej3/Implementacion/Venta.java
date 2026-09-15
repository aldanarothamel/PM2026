import java.util.ArrayList;
import java.util.List;

public class Venta {
    private final double total;
    private final List<Pago> pagos;
    private boolean pagada;

    public Venta(double total) {
        this.total = total;
        this.pagos = new ArrayList<>();
        this.pagada = false;
    }

    public void agregarPago(Pago pago) {
        if (pagada) {
            throw new IllegalStateException("La venta ya ha sido cancelada en su totalidad.");
        }
        this.pagos.add(pago);
    }

    public double getTotalPagado() {
        return pagos.stream().mapToDouble(Pago::getMonto).sum();
    }

    /**
     * Método solicitado en el Punto B y adaptado al Punto C.
     */
    public void pagar() {
        if (pagada) {
            throw new IllegalStateException("La venta ya se encuentra pagada.");
        }

        double totalCubierto = getTotalPagado();
        if (Double.compare(totalCubierto, this.total) != 0) {
            throw new IllegalStateException("El monto total de los pagos ($" + totalCubierto 
                    + ") no coincide con el total de la venta ($" + this.total + ").");
        }

        // Ejecución polimórfica de cada pago registrado
        for (Pago p : pagos) {
            p.ejecutar();
        }

        this.pagada = true;
    }

    public double getTotal() {
        return total;
    }

    public boolean isPagada() {
        return pagada;
    }
}
