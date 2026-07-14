Padrões de projeto utilizados:

    Padrão	   Onde aparece	                                                  Função
 
    Builder	   PedidoBuilder.create().id().cliente().itensPedidos().build()	  Constrói o objeto Pedido de forma organizada e legível.
    Strategy	 DescontoStrategy.aplicarDesconto(new Desconto10(), valor)	    Permite trocar a regra de desconto sem alterar o restante do código.
    Factory	   FormaDePagamentoFactory.getFormaDePagamento(...)	              Centraliza a criação da forma de pagamento e desacopla a Main das classes concretas.
