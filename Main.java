public class Main {
    public static void main(String[] args) {
        // Utilizando a fachada para processar um pedido
        Facade facade = new Facade();
        facade.processarPedido("ProdutoA", 2, "Cartão de Crédito", 100.0, "Rua Exemplo, 123");
    }
}
