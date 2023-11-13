/*For a given number N, the purpose is to find all the prime numbers from 1 to N.

Examples:  

Input: N = 11
Output: 2, 3, 5, 7, 11
Input: N = 7
Output: 2, 3, 5, 7  */
package BasicsOfJava;

import java.util.Scanner;

public class PrimeNum1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();
        if (number>0) {
            for (int i = 0; i < number + 1; i++) {
            int flag=0;
            if (i==0 || i==1) {
                continue;
            }for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    flag=1;
                }
            }if (flag==0) {
                System.out.print(i+" ");
            }
        }
        } else {
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}
