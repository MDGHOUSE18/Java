
public class Pyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            //inner loop for spaces
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            //inner loop for printing stars
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
