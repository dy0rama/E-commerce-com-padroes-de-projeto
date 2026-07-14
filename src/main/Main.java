package main;

import builder.PedidoBuilder;
import factory.FormaDePagamentoFactory;
import factory.MetodosDePagamento;
import model.Cliente;
import model.ItemPedido;
import model.Pedido;
import model.Produto;
import strategy.Desconto10;
import strategy.Desconto20;
import strategy.DescontoStrategy;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Main {
    static void main() {

        Pedido pedidoUM = PedidoBuilder.create().id(1).cliente(new Cliente("Rodrigo", "rodrigo@gmail.com"))
                .itensPedidos(List.of(new ItemPedido(new Produto("Processador", 1299.00), 3),
                        new ItemPedido(new Produto("Placa-Mãe", 799.00), 2))).build();
        double valorTotalUm = pedidoUM.calcularTotal();

        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        System.out.print(pedidoUM);
        System.out.println("Valor do Desconto: " + formatter.format(DescontoStrategy.aplicarDesconto(new Desconto10(), valorTotalUm)));
        FormaDePagamentoFactory.getFormaDePagamento(MetodosDePagamento.PIX).pagar();

        System.out.println();
        Pedido pedidoDois = PedidoBuilder.create().id(2).cliente(new Cliente("Alessandra", "alessandra@gmail.com"))
                .itensPedidos(List.of(new ItemPedido(new Produto("Monitor", 999.00), 2),
                        new ItemPedido(new Produto("Placa de Video", 2799.00), 2),
                        new ItemPedido(new Produto("Gabinete", 599.00), 1))).build();
        double valorTotalDois = pedidoDois.calcularTotal();

        System.out.print(pedidoDois);
        System.out.println("Valor do Desconto: " + formatter.format(DescontoStrategy.aplicarDesconto(new Desconto20(), valorTotalDois)));
        FormaDePagamentoFactory.getFormaDePagamento(MetodosDePagamento.CARTAO).pagar();
    }
}
