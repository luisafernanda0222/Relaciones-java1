package RelacionesJava1;

public class Cliente {
    private String nombre;
    private String nif; // Número de Identificación Fiscal


    public Cliente(String nombre, String nif) {
        this.nombre =nombre;
        this.nif = nif;
    }

    public Cliente() {

    }

    //crear Getters y Setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
