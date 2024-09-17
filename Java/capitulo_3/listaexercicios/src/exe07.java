public class exe07 {
    public static void main(String[] args) {
        
        int x = 250;
        
        System.out.print(x);
        
        while (x != 1) {
            int y;
            if (x % 2 == 0) { // x é par
                y = x / 2;
            } else { // x é ímpar
                y = 3 * x + 1;
            }

            System.out.print(" -> " + y);
            
            x = y;
        
        }
        System.out.print(" -> 1");
    }
}
