public class CalculadoraDeIMC {
    public static void main(String[] args) {
        double peso = 72.0;
        double altura = 1.5;

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC (Índice de Massa Corporal é: " + imc);
    }
}