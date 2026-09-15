public class Tarjeta {
    public void cobrar(String nombreTarjeta, String numero, String digitos, double importe) {
        System.out.println("Cobro a tarjeta " + nombreTarjeta + " terminada en " 
                + numero.substring(Math.max(0, numero.length() - 4)) + " por $" + importe);
    }
}
