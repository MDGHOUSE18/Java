public class PolindromeAlphabets {
    public static void main(String[] args) {
        int n = 9;
        char ch ;
        //outer loop
        for (int i = 1; i <= n; i++) {
            ch = 'a';
            //spaces
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");
            }           
            //decending numbers
            for (int j = i; j > 1; j--) {
                System.out.print(ch);
                ch++;
            }
            ch = 'a';
            //assending numbers
            for (int j = 1; j <=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
