public class exe06 {
    public static void main(String[] args) {
        
        int a = 0;
        int b = 1; 
        
        System.out.println(a);
        
        if (b <= 100) {
            System.out.println(b);
        }

        while (true) {
            int proximo = a + b;
            if (proximo > 100) {
                break;
            }
            System.out.println(proximo);
            a = b;
            b = proximo;
        }
    }
}

