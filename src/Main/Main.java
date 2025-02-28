package Main;

import Modelo.Pedido;
import Modelo.Producto;
import Servicio.PedidoService;

import java.util.List;
import java.util.Scanner;

public class Main {

    private Pedido pedido;
    private Producto producto;
    private PedidoService pedidoService;

    public static void main(String[] args) {

    /*inicilizar serivice*/
    PedidoService pedidoService = new PedidoService();
    /*inicializar pedido*/
    Pedido pedido = new Pedido();


    /*recoger datos*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("escribe el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.println("cuantos productos vas a agregar: ");


        int cantidad = scanner.nextInt();
        int contador=0;

        //repetir mientras contador sea menos que cantidad
        while (contador<cantidad){
            /*inicializar producto*/
            Producto producto = new Producto();
            Scanner nombreS = new Scanner(System.in);
            System.out.println("nombre del prodcuto: ");
            String nombre = nombreS.nextLine();
            System.out.println("precio del producto: ");
            double precio = scanner.nextDouble();

            /*crar producto*/
            producto.setNombre(nombre);
            producto.setPreicio(precio);
            if (producto != null) {
                pedido.guardarProducto(producto);

            }else{
                System.out.println("producto es null");
            }

            contador++;
        }
        /*guardar pedido*/
        pedido.setNombreCliente(nombreCliente);
        pedidoService.guardarPedido(pedido);
        pedidoService.totalPedido(pedido);
        System.out.println("datos guardados: ");
        pedidoService.mostrarBD();

    }
}