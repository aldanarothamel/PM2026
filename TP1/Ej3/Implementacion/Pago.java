public class Pago {
    private final double monto;
    private final FormaDePago formaDePago;

    public Pago(double monto, FormaDePago formaDePago) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a pagar debe ser mayor a cero.");
        }
        if (formaDePago == null) {
            throw new IllegalArgumentException("Debe especificarse una forma de pago válida.");
        }
        this.monto = monto;
        this.formaDePago = formaDePago;
    }

    public void ejecutar() {
        this.formaDePago.procesarPago(this.monto);
    }

    public double getMonto() {
        return monto;
    }
}
