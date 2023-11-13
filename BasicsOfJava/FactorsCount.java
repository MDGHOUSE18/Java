/* Write a Java program to accept an integer and count the factors of the number.
Sample Output:

Input an integer: 25                                                   
3
 */
package BasicsOfJava;

import java.util.Scanner;

public class FactorsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int count=0, number = sc.nextInt();
        for (int i = 1; i < number+1; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
