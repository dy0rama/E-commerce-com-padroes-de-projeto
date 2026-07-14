package strategy;

import model.Pedido;

public class DescontoStrategy {
    public static double aplicarDesconto(CalculoDeDesconto calculoDeDesconto, double valorTotal) {
        return calculoDeDesconto.calculaDesconto(valorTotal);
    }
}
