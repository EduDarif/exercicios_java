public class Exercicio_9 {
    public static void main(String[] args) {
        
        double valor_carro = 35000.0; 
        double taxa_desvalorizacao = 0.07; 
        double taxa_investimento = 0.07; 
        int periodo = 10;

        for (int ano = 1; ano <= periodo; ano++){

            double valor_carro_depreciado = valor_carro * Math.pow((1 - taxa_desvalorizacao), ano);

            double valor_investimento = valor_carro * Math.pow((1 + taxa_investimento), ano);

            double diferenca = valor_investimento - valor_carro_depreciado;

            System.out.println("Ano " + ano + ":");
            System.out.printf("Valor do carro depreciado: R$ %.2f\n", valor_carro_depreciado);
            System.out.printf("Valor do investimento: R$ %.2f\n", valor_investimento);
            System.out.printf("Diferença entre investimento e carro depreciado: R$ %.2f\n", diferenca);
            System.out.println();
        }
    }
}
