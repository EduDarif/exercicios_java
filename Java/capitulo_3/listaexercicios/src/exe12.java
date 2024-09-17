import java.util.Arrays;

public class exe12 {
    public static void main(String[] args) {
        
        int num1 = 15;
        int num2 = 9;
        int num3 = 42;

        int[] numeros = {num1, num2, num3};

        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

