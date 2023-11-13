/*Problem Statement: Given three numbers x, y, and z of which aim is to get the largest among these three numbers.
Example: 

Input: x = 7, y = 20, z = 56
Output: 56                    // value stored in variable z
*/
package BasicsOfJava;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c) {
            System.out.println(a);
        } else if(b>c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        sc.close();
    }
}
