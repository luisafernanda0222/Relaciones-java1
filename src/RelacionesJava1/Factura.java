package RelacionesJava1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ÍtemFactura[] items;

    public Factura(int folio,String descripcion,Date fecha,Cliente cliente, ÍtemFactura[] items){
        this.folio=folio;
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.cliente=cliente;
        this.items=items;
    }

    public Factura(String desc, Cliente cliente) {
    }

    //crear Getters y Setter

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ÍtemFactura[] getItems() {
        return items;
    }

    public void setItems(ÍtemFactura[] items) {
        this.items = items;
    }
    public void addItemFactura(ÍtemFactura item) {
        // Buscar la primera posición vacía en el arreglo de items
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == null) {
                this.items[i] = item; // Añadir el ítem en la primera posición vacía
                break; // Salir del bucle después de agregar el ítem
            }
        }
    }
    public float calcularTotal() {
        float total = 0.0f;

        // Iterar sobre cada ítem en el arreglo de items
        for (ÍtemFactura item : this.items) {
            if (item != null) {
                total += item.calcularImporte(); // Sumar el importe del ítem al total
            }
        }

        return total; // Devolver el importe total de la factura
    }
    // prepara el detalle de la factura
    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura Nº: ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for(ÍtemFactura item: this.items){
            if(item == null){
                continue;
            }
            sb.append(item)
                    .append("\n");
        }
        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }

}
