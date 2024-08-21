import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {

        double salario_minimo = 1210.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário: R$ ");
        double salario_usuario = scanner.nextDouble();

        double quantidade_salarios_minimos = salario_usuario / salario_minimo;

        System.out.printf("Você ganha aproximadamente %.2f salários mínimos.\n", quantidade_salarios_minimos);

        scanner.close();
    }
}