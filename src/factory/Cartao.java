package factory;

public class Cartao implements FormaDePagamento{
    @Override
    public void pagar() {
        System.out.println("Forma de Pagamento: Cartão de Crédito/Débito");
    }
}
