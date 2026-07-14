package strategy;

public class Desconto0 implements CalculoDeDesconto{
    @Override
    public double calculaDesconto(double valor) {
        return valor * 0;
    }
}
