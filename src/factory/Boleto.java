package factory;

public class Boleto implements FormaDePagamento{
    @Override
    public void pagar() {
        System.out.println("Forma de Pagamento: Boleto Bancário");
    }
}
