package factory;

public class FormaDePagamentoFactory {
    public static FormaDePagamento getFormaDePagamento(MetodosDePagamento tipo){
        if(tipo.equals(MetodosDePagamento.CARTAO)){
            return new Cartao();
        } else if (tipo.equals(MetodosDePagamento.BOLETO)) {
            return new Boleto();
        }
        return new PIX();
    }
}
