public class Exercicio_2 {
    public static void main(String[] args) {

        // NOTAS DO PRIMEIRO BIMESTRE
        double provaPratica_1 = 40.5;
        double provaTeorica_1 = 35.6;
        double integrada_1 = 0.5;
        double aep_1 = 0.9;

        // NOTAS DO SEGUNDO BIMESTRE
        double provaPratica_2 = 35.7;
        double provaTeorica_2 = 50.5;
        double integrada_2 = 10;
        double aep_2 = 0.3;

        // MEDIA DO PRIMEIRO BIMESTRE

        double notaBim_1 = provaPratica_1 + provaTeorica_1 + integrada_1 + aep_1;

            System.out.println("Nota do primeiro bimestre: " + notaBim_1);

        // MEDIA DO SGUNDO BIMESTRE

        double notaBmim_2 = provaPratica_2 + provaTeorica_2 + integrada_2 + aep_2;
        
            System.out.println("Nota do segundo bimestre: " + notaBmim_2);

        double media = (notaBim_1 + notaBmim_2) / 2;

            System.out.println("Média: " + media);
    }
}
