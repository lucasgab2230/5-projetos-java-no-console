public class ConversorDeTemperatura {
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");
        System.out.println(celsius + " graus Celsius é igual a " + kelvin + " Kelvin.");
    }
}
