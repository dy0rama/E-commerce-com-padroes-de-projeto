package strategy;

public class Desconto30 implements CalculoDeDesconto {
    @Override
    public double calculaDesconto(double preco) {
        return preco * 0.30;
    }
}
