public class RachaContaRestaurante {
    public static void main(String[] args) {
        double valorDaConta = 100.00;
        double valorDaGorjeta = 10;
        int numeroDePessoas = 2;

        double totalComGorjeta = valorDaConta * (1 + valorDaGorjeta / 100);

        double valorPorPessoa = totalComGorjeta / numeroDePessoas;

        System.out.println("Cada um de vocês pagará: R$" + valorPorPessoa);
    }
}
