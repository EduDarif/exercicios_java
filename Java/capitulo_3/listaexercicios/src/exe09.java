public class exe09 {
    
    public static void main(String[] args) {
        
        double valorHora = 5.0;
        int horasTrabalhadas = 220; 
        
        double salarioBruto = valorHora * horasTrabalhadas;
        
        double descontoIR;
        if (salarioBruto <= 900) {
            descontoIR = 0;
        } else if (salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.10;
        } else {
            descontoIR = salarioBruto * 0.20;
        }
        
        double descontoINSS = salarioBruto * 0.10;
        
        double fgts = salarioBruto * 0.11;
        
        double descontoVR = salarioBruto * 0.03;
        
        double totalDescontos = descontoIR + descontoINSS + descontoVR;
        
        double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.printf("Salário Bruto: (%.2f * %d): R$ %.2f%n", valorHora, horasTrabalhadas, salarioBruto);
        System.out.printf("(-) IR (%.0f%%): R$ %.2f%n", descontoIR > 0 ? (descontoIR / salarioBruto) * 100 : 0, descontoIR);
        System.out.printf("(-) INSS (10%%): R$ %.2f%n", descontoINSS);
        System.out.printf("(-) Vale Refeição (3%%): R$ %.2f%n", descontoVR);
        System.out.printf("FGTS (11%%): R$ %.2f%n", fgts);
        System.out.printf("Total de descontos: R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
    }
}


