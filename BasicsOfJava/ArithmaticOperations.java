/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5 */
package BasicsOfJava;


import java.util.Scanner;

public class ArithmaticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Sum  : " + (a + b));
        System.out.println("Subftraction  : " + (a - b));
        System.out.println("Multiply  : " + (a * b));
        System.out.println("Divide  : " + (a / b));
        System.out.println("Remainder  : " + (a % b));
        sc.close();
    }

    
}