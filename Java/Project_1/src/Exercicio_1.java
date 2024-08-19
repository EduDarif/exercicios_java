/*
 * 
 * Calculo das temperatura 
 * 
 */


public class Exercicio_1 {
    public static void main(String[] args) {

        double t_celsius = 25; // variavel de entrada

        // variaveis de saida
        double t_fahrenheit, t_kelvin, t_reaumur, t_rankine;

        // INICIO DO PROCESSAMENTO -----------------------------------------------

        //calcula a temperatura em fahrenheit
        t_fahrenheit = t_celsius * 1.8 + 32;
        //calcula a temperatura em kelvin
        t_kelvin = t_celsius + 273.15;
        //calcula a temperatura em reamur
        t_reaumur = t_celsius * 0.8;
        //calcula a temperatura em rankine
        t_rankine = t_celsius * 1.8 + 459.67;

        // FIM DO PROCESSAMENTO ---------------------------------------------------

        //----------------------------------------------------------------------------//
        
        //IMPRIME AS TEMPERATURAS
        System.out.println("Capitulo 2 - Exercício 01");
        System.out.println("Temperatura em Fahrenheit -> " + t_fahrenheit);
        System.out.println("Temperatura em Kelvin -> " + t_kelvin);
        System.out.println("Temperatura em Reamur -> " + t_reaumur);
        System.out.println("Temperatura em Rankine -> " + t_rankine);

    }
}