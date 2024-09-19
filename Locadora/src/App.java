public class App {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.CNH = 12111111;
        cliente.CPF = 12111111;
        cliente.nome = "alberto";
        Carro carro = new Carro();
        carro.ano = 2001;
        carro.cor = "azul";
        carro.modelo = "alberto";
        Locacao locacao = new Locacao();
        locacao.locacao = 010122001;
        locacao.protocolo = 12111111;
        locacao.validade = 010122002;

    }
}
