public class PagoPayPalAdapter implements FormaDePago {
    private final String usuario;
    private final PayPal servicioPayPal;

    public PagoPayPalAdapter(String usuario, PayPal servicioPayPal) {
        this.usuario = usuario;
        this.servicioPayPal = servicioPayPal;
    }

    @Override
    public void procesarPago(double importe) {
        this.servicioPayPal.cobrar(this.usuario, importe);
    }
}
