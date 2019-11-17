import java.util.*;
public class SistemaPedidos {
    public static void main (String[] args) {
        Cliente cliente = new Cliente("Isaura", "03145209027", "Av. Presidente Vargas 382", "koch.isaura@gmail.com");
        Produto produto = new Produto("meia", 14.5, 2.2);
        Envio envio = new Envio("sedex", 50.1);
        new Pedido("boleto", produto, cliente, envio);
    }
}