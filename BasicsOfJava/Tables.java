// Write a java program to print the table of given number
package BasicsOfJava;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table number : ");
        int number=sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + "*" + i + "=" + (number * i));
        }
        sc.close();
    }
}
