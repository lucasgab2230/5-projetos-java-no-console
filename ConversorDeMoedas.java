public class ConversorDeMoedas {
    public static void main(String[] args) {
        double valorEmReais = 100.00;
        double cotacaoDolar = 5.02;
        double cotacaoEuro = 5.62;

        double valorEmDolar = valorEmReais / cotacaoDolar;
        double valorEmEuro = valorEmReais / cotacaoEuro;

        System.out.println("Seus R$" + valorEmReais + " valem hoje: Em Dólar: " + valorEmDolar + " e em Euro: " + valorEmEuro + "!");
    }
}
