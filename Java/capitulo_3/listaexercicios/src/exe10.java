public class exe10 {
    public static void main(String[] args) {
        
        double salarioAtual = 1200.00;

        double percentualAumento;
        double valorAumento;
        double novoSalario;

        if (salarioAtual <= 280.00) {
            percentualAumento = 20.0;
        } else if (salarioAtual > 280.00 && salarioAtual <= 700.00) {
            percentualAumento = 15.0;
        } else if (salarioAtual > 700.00 && salarioAtual <= 1500.00) {
            percentualAumento = 10.0;
        } else {
            percentualAumento = 5.0;
        }

        valorAumento = salarioAtual * (percentualAumento / 100);
        novoSalario = salarioAtual + valorAumento;

        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.0f%%%n", percentualAumento);
        System.out.printf("Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("Novo salário, após o aumento: R$ %.2f%n", novoSalario);
    }
}

