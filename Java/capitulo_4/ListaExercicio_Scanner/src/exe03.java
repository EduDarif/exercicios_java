import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número inteiro (0 para sair): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (isPrimo(numero)) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }

        } while (numero != 0);

        scanner.close();
    }

    public static boolean isPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
