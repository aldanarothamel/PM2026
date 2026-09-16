public class Caja implements ElementoVenta {
    private final String tipoChocolate;
    private final int unidades;
    private final double precioUnitario;

    public Caja(String tipoChocolate, int unidades, double precioUnitario) {
        if (precioUnitario < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.tipoChocolate = tipoChocolate;
        this.unidades = unidades;
        this.precioUnitario = precioUnitario;
    }

    @Override
    public double precio() {
        return this.precioUnitario;
    }

    public String getTipoChocolate() {
        return tipoChocolate;
    }

    public int getUnidades() {
        return unidades;
    }
}
