package builder;

import model.Cliente;
import model.ItemPedido;
import model.Pedido;
import strategy.DescontoStrategy;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {
    private int id;
    private Cliente cliente;
    private final List<ItemPedido> itensPedidos = new ArrayList<>();
    private DescontoStrategy desconto;

    public static PedidoBuilder create() {
        return new PedidoBuilder();
    }

    public PedidoBuilder id(int id) {
        this.id =  id;
        return this;
    }

    public PedidoBuilder cliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public PedidoBuilder itensPedidos(List<ItemPedido> itens) {
        this.itensPedidos.addAll(itens);
        return this;
    }

    public PedidoBuilder cuponsDeDesconto(DescontoStrategy desconto) {
        this.desconto = desconto;
        return this;
    }

    public PedidoBuilder valorTotal() {
        return this;
    }

    public Pedido build(){
        return new Pedido(id, cliente, itensPedidos);
    }
}
