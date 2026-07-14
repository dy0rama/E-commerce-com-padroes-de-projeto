package strategy;

public class Desconto10 implements CalculoDeDesconto {
    @Override
    public double calculaDesconto(double preco) {
        return preco * 0.10;
    }
}
