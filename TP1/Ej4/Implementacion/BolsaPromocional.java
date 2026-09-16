import java.util.ArrayList;
import java.util.List;

public class BolsaPromocional implements ElementoVenta {
    private static final double DESCUENTO = 0.10; // 10% de descuento
    private final List<ElementoVenta> elementos;

    public BolsaPromocional() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(ElementoVenta elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("No se puede agregar un elemento nulo.");
        }
        this.elementos.add(elemento);
    }

    public void remover(ElementoVenta elemento) {
        this.elementos.remove(elemento);
    }

    @Override
    public double precio() {
        double subtotal = 0.0;
        for (ElementoVenta elemento : elementos) {
            subtotal += elemento.precio();
        }
        // Aplica el 10% de descuento sobre el total acumulado
        return subtotal * (1.0 - DESCUENTO);
    }

    public List<ElementoVenta> getElementos() {
        return elementos;
    }
}
