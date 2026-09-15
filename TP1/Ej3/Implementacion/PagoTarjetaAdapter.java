public class PagoTarjetaAdapter implements FormaDePago {
    private final String nombreTarjeta;
    private final String numero;
    private final String digitos;
    private final Tarjeta servicioTarjeta;

    public PagoTarjetaAdapter(String nombreTarjeta, String numero, String digitos, Tarjeta servicioTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
        this.numero = numero;
        this.digitos = digitos;
        this.servicioTarjeta = servicioTarjeta;
    }

    @Override
    public void procesarPago(double importe) {
        this.servicioTarjeta.cobrar(this.nombreTarjeta, this.numero, this.digitos, importe);
    }
}
