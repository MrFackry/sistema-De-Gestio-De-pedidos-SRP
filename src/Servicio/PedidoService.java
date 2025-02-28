package Servicio;

import Modelo.Pedido;
import Modelo.Producto;
import Persistencia.PedidoRepository;

import java.util.List;

public class PedidoService {
    private PedidoRepository pedidoRepository;
    private Pedido pedido;

    /*se inicializa Repository en el constructor para usarlo
    en cualquier instacia de Servicey y evitar un nullPointer exepction*/
    public PedidoService() {
        this.pedidoRepository = new PedidoRepository();
    }

    /*logica de negocio*/

    //calculamos el precio total del pedido
    public double totalPedido(Pedido pedido){
        List<Producto> productos = pedido.getListaProductos();
        double precioTotal = 0.0;
        for (int i = 0;i < productos.size(); i++) {
            precioTotal += productos.get(i).getPreicio();
        }
    return precioTotal;
    }

    //guardamos un pedido
    public void guardarPedido(Pedido pedido){
        pedido.setTotalPedidos(totalPedido(pedido));
        pedidoRepository.gurdarPedidos(pedido);
    }
    //mostramos los datos para revissar si todo esta bien
    public void mostrarBD(){
        System.out.println(pedidoRepository.getPedidosBD());
    }
}
