public class Exercicio_8 {
    public static void main(String[] args) {
        
        double a1 = 5;
        double b1 = 5;
        double c1 = 5;

        double media_1 = (a1 + b1 + c1) / 3;

        System.out.println("A média dos primeiros números são: " + media_1);

        double a2 = 6;
        double b2 = 2;
        double c2 = 4;

        double media_2 = (a2 + b2 + c2) / 3;

        System.out.println("A média dos segundos números são: " + media_2);

        double media_das_media = (media_1 + media_2) / 2;

        System.out.println("A média das duas médias são: " + media_das_media); 
        
    }
}