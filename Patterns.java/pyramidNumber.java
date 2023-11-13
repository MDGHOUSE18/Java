

public class pyramidNumber {
    public static void main(String[] args) {
        int n = 9,count=1;
        //rows
        for (int i = 1; i <=n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
                
            }
            //numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                
            }
            System.out.println("");
            count++;
        }
    }
}
