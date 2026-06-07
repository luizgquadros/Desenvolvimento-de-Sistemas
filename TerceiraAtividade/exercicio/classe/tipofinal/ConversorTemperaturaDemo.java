package exercicio.classe.tipofinal;

final class ConversorTemperatura {

    public double celsiusParaFahrenheit(double c){
        return (c * 1.8) + 32;
    }
}

public class ConversorTemperaturaDemo {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();
        System.out.println("20ºC em ºF: " + conversor.celsiusParaFahrenheit(20) + "ºF" );
    }
}
