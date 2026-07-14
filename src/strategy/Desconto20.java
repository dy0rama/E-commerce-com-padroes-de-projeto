package strategy;

public class Desconto20 implements CalculoDeDesconto {
    @Override
    public double calculaDesconto(double preco) {
        return preco * 0.20;
    }
}
