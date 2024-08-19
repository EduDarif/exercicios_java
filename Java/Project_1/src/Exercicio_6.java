public class Exercicio_6 {
    public static void main(String[] args) {
        
        double combustivel = 6.50;
        double distancia = 24;
        double v_km_litro = 12;

        double consumo = (distancia / v_km_litro) * combustivel;

            System.out.println("Valor gasto de combustível: " + consumo);
    }
    
}