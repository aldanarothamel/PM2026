public class PagoTransferenciaAdapter implements FormaDePago {
    private final String cbuOrigen;
    private final Banco servicioBanco;

    public PagoTransferenciaAdapter(String cbuOrigen, Banco servicioBanco) {
        this.cbuOrigen = cbuOrigen;
        this.servicioBanco = servicioBanco;
    }

    @Override
    public void procesarPago(double importe) {
        this.servicioBanco.transferir(this.cbuOrigen, importe);
    }
}
