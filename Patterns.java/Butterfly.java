

public class Butterfly {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            //first half
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        //2nd half
        for (int i = n; i >= 1; i--) {
            //first half
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2*(n - i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
    }
}
