package Modelo;

public class Producto {

    private String nombre;
    private double preicio;

    /*GettersAndSetters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPreicio() {
        return preicio;
    }

    public void setPreicio(double preicio) {
        this.preicio = preicio;
    }

    /*ToString*/
    //hace que los datos sean legibles
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", preicio=" + preicio +
                '}';
    }
}
