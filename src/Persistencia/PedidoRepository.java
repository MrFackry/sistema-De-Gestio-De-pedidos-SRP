package Persistencia;

import Modelo.Pedido;
import Modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepository {

    private List<Pedido> pedidosBD;

    public PedidoRepository() {
        this.pedidosBD = new ArrayList<>();
    }

    /*logica*/


    public void gurdarPedidos(Pedido pedido){
        pedidosBD.add(pedido);
    }

    public List<Pedido> getPedidosBD() {
        return pedidosBD;
    }
}
