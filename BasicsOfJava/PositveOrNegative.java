
//Write a Java program to get a number from the user and print whether it is positive or negative.
package BasicsOfJava;
import java.util.Scanner;

public class PositveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number>0) {
            System.out.println(number+" is positive number");
        } else {
            System.out.println(number + " is negative number");
        }
        sc.close();
    }
}
