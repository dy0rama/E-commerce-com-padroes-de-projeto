package model;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Pedido implements Comparable<Pedido>{
    private final int id;
    private final Cliente cliente;
    private final List<ItemPedido> itensPedidos = new ArrayList<>();

    public Pedido(int id, Cliente cliente, List<ItemPedido> itensPedidos) {
        this.id = id;
        this.cliente = cliente;
        this.itensPedidos.addAll(itensPedidos);
    }

    public double calcularTotal(){
        double total = 0;
        for(ItemPedido item: itensPedidos){
            total += item.getSubtotal();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public String getItensPedidos(){
        return itensPedidos.stream().map(ItemPedido::toString).collect(Collectors.joining("\n"));
    }

    private String formatarPreco(double valor) {
        NumberFormat formatador = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        return formatador.format(valor);
    }

    @Override
    public int compareTo(Pedido o) {
        return Double.compare(o.calcularTotal(), this.calcularTotal());
    }

    @Override
    public String toString(){
        return String.format("""
                =========================
                ID: %d
                Cliente
                %s
                Itens Pedidos
                %s
                
                Qtd de Pedidos: %s
                Total da Compra: %s
                """, getId(), getCliente(), getItensPedidos(), itensPedidos.size(), formatarPreco(calcularTotal()));
    }
}
