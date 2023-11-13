public class PolindromeNumbers {
    public static void main(String[] args) {
        int n = 9;
        //outer loop
        for (int i = 1; i <=n; i++) {
            //spaces
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");
            }           
            //decending numbers
            for (int j = i; j>1; j--) {
                System.out.print(j);
            }
            //assending numbers
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
