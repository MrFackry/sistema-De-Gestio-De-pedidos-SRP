package Persistencia;

import Modelo.Pedido;
import Modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepository {

    private List<Pedido> pedidosBD;
    /*se inicializa pedidodBD en el constructor para que
     toda instacia de Repository tenga pedidosBD y evitar errores*/
    public PedidoRepository() {
        this.pedidosBD = new ArrayList<>();
    }

    /*logica*/
    //guardamos en BD el pedido
    public void gurdarPedidos(Pedido pedido){
        pedidosBD.add(pedido);
    }
    //obtenemos lod datos guardados en BD
    public List<Pedido> getPedidosBD() {
        return pedidosBD;
    }
}
