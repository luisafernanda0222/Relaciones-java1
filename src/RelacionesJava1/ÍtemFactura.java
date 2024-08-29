package RelacionesJava1;

public class ÍtemFactura{
    private Producto producto;
    private int cantidad;

    public ÍtemFactura (Producto producto,int cantidad) {
        this.producto=producto;
        this.cantidad=cantidad;
    }

    public ÍtemFactura(int i, Producto producto) {
    }
    //crear Getters y Setter

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



    // metodo para calcular el importe de un producto.

    public float calcularImporte() {

        // operacion es catidad * precio que tiene el objeto producto
        return (float) (cantidad* producto.getPrecio());
    }


    // metodo para mostrar informacion del item registrado.

    @Override
    public String toString() {
        return producto +
                "\t" + cantidad +
                "\t" + calcularImporte();
    }
}

