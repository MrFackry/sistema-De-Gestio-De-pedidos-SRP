package Persistencia;

import Modelo.Pedido;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PedidoRepository {
    /*Se decalra el archvio json como un static final para que sea una costante global y no pueda ser modificada*/
    private static final String ARCHIVO_JSON = "pedidos.json";

    //se instancia gson con un formato legible
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    //se leen el archivo json  para tarsformarlo a una lista
    public List<Pedido> obtenerPedidos (){
        try (FileReader reader = new FileReader(ARCHIVO_JSON)) {
            Type listType = new TypeToken<List<Pedido>>() {}.getType();//combertimos el json en una lista
            List<Pedido> pedidos = gson.fromJson(reader, listType);//leemos el contenido del json y lo ponemos en una lista
            return pedidos != null ? pedidos : new ArrayList<>();//coparamos si pedido es null para devolcer una lista
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo, se creará una nueva lista.");
            return new ArrayList<>();
        } catch (Exception e) {
            System.out.println("Error al leer el JSON: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    // guardamos en los pedidos en el json
    public void guardarPedidosJson(Pedido pedido){
        List<Pedido> pedidos = obtenerPedidos(); //Lee los pedidos actuales
        pedidos.add(pedido); //agregar el nuevo pedido a la lista existente

        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(pedidos, writer); // Guardar toda la lista en JSON
            System.out.println("Pedido guardado en pedidos.json");
        } catch (IOException e) {
            System.out.println("Error al guardar el pedido: " + e.getMessage());
        }
    }

    //obtener datos guardados en el json
    public void mostrarPedido() {
        List<Pedido> pedidos = obtenerPedidos();//tenemos la lista
        System.out.println("Pedidos guardados: ");
        //recorremos la lista y mostramos los  pedidos
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    }








