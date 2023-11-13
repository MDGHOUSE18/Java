//prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
package BasicsOfJava;

import java.util.Scanner;

public interface FeverCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp>100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
        sc.close();
    }
}
