/*. Write a Java program to print the ASCII value of a given character.
Expected Output

The ASCII value of Z is :90 */
package BasicsOfJava;

import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char C = sc.next().charAt(0);
        int NewC = (int) C;
        System.out.println("the ASCII value of a given character is "+NewC);
        sc.close();
    }
}
