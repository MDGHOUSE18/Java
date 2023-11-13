//Write a java program to given number is Prime or not
package BasicsOfJava;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int Number = sc.nextInt(),flag=0;
        if (Number>0) {
            if (Number==1) {
                System.out.println(Number+" is not a prime");
            } else {
                for (int i = 2; i < Number; i++) {
                    if (Number%i==0) {
                        flag++;
                    }
                }
                if (flag != 0) {
                    System.out.println(Number+" is not a Prime"); 
                } else {
                    System.out.println(Number+" is a prime");
                }
            }
        } else {
            System.out.println("You entered negative number");
        }
        sc.close();
    }
}
