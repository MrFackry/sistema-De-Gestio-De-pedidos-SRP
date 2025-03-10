package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nombreCliente;
    private List<Producto> listaProductos;
    private double totalPedidos;

    /*GettersAndSetters*/
    public Pedido() {
        this.listaProductos =  new ArrayList<>();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double getTotalPedidos() {
        return totalPedidos;
    }

    public void setTotalPedidos(double totalPedidos) {
        this.totalPedidos = totalPedidos;
    }

    /*ToString*/
    //hace que los datos sean legibles
    @Override
    public String toString() {
        return "PedidoService{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", listaProductos=" + listaProductos +
                ", totalPedidos=" + totalPedidos +
                '}';
    }

    /*Guarda los productos en la lista de productos*/
    public void guardarProducto(Producto producto){
        listaProductos.add(producto);
    }
}
