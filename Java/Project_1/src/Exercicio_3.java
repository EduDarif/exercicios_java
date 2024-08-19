/* Exercicio numero 3 feito em sala
 * Gasto de alimentação por mês AND
 * Gasto de transporte por mês
 */ 

public class Exercicio_3 {

    public static void main(String[] args) {
        
        double g_ali = 30;
        double g_transp = 12;

//----------------------------------------------------------------------//
        // GASTO TOTAL EM DIAS UTEIS COM ALIMENTAÇÃO E TRANSPORTE
        double g_total = (g_ali + g_transp) * 22;

        System.out.println("Gasto total em dia uteis: " + g_total);

//---------------------------------------------------------------------//
        //MEDIA DIARIA GASTA NO MÊS
        double media_diaria = g_total / 30;

        System.out.println("Media diaria de gastos: " + media_diaria);
        
    }
    
}