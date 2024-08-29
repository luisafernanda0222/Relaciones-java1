package RelacionesJava1;


public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto() {
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
    }

    //crear Getters y Setter

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
