//Write a Java program that takes a year from the user and print whether that year is a leap year or not.
package BasicsOfJava;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int Year = sc.nextInt();
        if (((Year%4==0) && (Year%100!=0) ||(Year%400==0))) {
            System.out.println(Year+" is a Leap Year");
        } else {
            System.out.println(Year + " is not a Leap Year");
        }
        sc.close();
    }
}
