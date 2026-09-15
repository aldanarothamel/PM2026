import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Remito {
    private int numero;
    private LocalDate fechaEmision;
    private List<ItemPedido> articulos;

    public Remito(int numero, LocalDate fechaEmision) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.articulos = new ArrayList<>();
    }

    public void agregarItem(ItemPedido item) {
        this.articulos.add(item);
    }
}
