public class Facade {
    private Estoque verificadorEstoque;
    private Pagamento processadorPagamento;
    private Envio servicoEnvio;

    public Facade() {
        this.verificadorEstoque = new Estoque();
        this.processadorPagamento = new Pagamento();
        this.servicoEnvio = new Envio();
    }

    // Método de fachada que lida com todo o processo de pedido
    public void processarPedido(String produto, int quantidade, String metodoPagamento, double valor, String enderecoEntrega) {
        if (verificadorEstoque.verificarDisponibilidade(produto, quantidade)) {
            processadorPagamento.processarPagamento(metodoPagamento, valor);
            servicoEnvio.enviarPedido(enderecoEntrega);
            System.out.println("Pedido processado com sucesso!");
        } else {
            System.out.println("Não foi possível processar o pedido devido à falta de estoque.");
        }
    }
}
