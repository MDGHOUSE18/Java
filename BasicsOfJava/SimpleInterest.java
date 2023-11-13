package BasicsOfJava;

import java.util.Scanner;

/*Simple interest is a quick method of calculating the interest charge on a loan. Simple interest is determined by multiplying the daily interest rate by the principal by the number of days that elapse between payments. 

Simple interest formula is given by:
Simple Interest = (P x T x R)/100 
Where, 
P is the principal amount 
T is the time and 
R is the rate
Examples: –
Example 1:
Input :  P = 10000
         R = 5
         T = 5
Output : 2500
Explanation - We need to find simple interest on 
Rs. 10, 000 at the rate of 5% for 5 
units of time.
Example 2:
Input :  P = 3000
         R = 7
         T = 1
Output : 210 */
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount : ");
        float P = sc.nextFloat();
        System.out.print("Enter the rate : ");
        float R = sc.nextFloat();
        System.out.print("Enter the time : ");
        float T = sc.nextFloat();
        float SI = (P * R * T) / 100;
        System.out.println(SI);
        sc.close();
    }
}
