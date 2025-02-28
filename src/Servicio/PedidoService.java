package Servicio;

import Modelo.Pedido;
import Modelo.Producto;
import Persistencia.PedidoRepository;

import java.util.List;

public class PedidoService {
    private PedidoRepository pedidoRepository;
    private Pedido pedido;


    public PedidoService() {
        this.pedidoRepository = new PedidoRepository();
    }



    /*logica*/


    public double totalPedido(Pedido pedido){
        List<Producto> productos = pedido.getListaProductos();
        double precioTotal = 0.0;
        for (int i = 0;i < productos.size(); i++) {
            precioTotal += productos.get(i).getPreicio();
        }
    return precioTotal;
    }

    public void guardarPedido(Pedido pedido){
        pedido.setTotalPedidos(totalPedido(pedido));
        pedidoRepository.gurdarPedidos(pedido);
    }

    public void mostrarBD(){
        System.out.println(pedidoRepository.getPedidosBD());
    }
}
