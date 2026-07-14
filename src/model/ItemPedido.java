package model;

import java.text.NumberFormat;
import java.util.Locale;

public class ItemPedido {
    private final Produto produto;
    private final int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubtotal(){
        return produto.getPreco() * quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String formatarPreco(double valor) {
        NumberFormat formatador = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        return formatador.format(valor);
    }

    @Override
    public String toString(){
        return "Produto: " + produto.getNome() + " | Qtd de Itens: " + getQuantidade() + " | Subtotal: " + formatarPreco(getSubtotal());
    }
}
