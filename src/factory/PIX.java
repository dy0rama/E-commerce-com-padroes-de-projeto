package factory;

public class PIX implements FormaDePagamento{
    @Override
    public void pagar() {
        System.out.println("Forma de Pagamento: PIX");
    }
}
