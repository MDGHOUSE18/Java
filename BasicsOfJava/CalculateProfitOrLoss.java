package BasicsOfJava;

import java.util.Scanner;

/*Given the Cost Price(CP) and Selling Price(SP) of a product. The task is to Calculate the Profit or Loss.
Examples: 
 

Input: CP = 1500, SP = 2000
Output: 500 Profit

Input: CP = 3125, SP = 1125
Output: 2000 Loss
Formula: 
 

Profit = (Selling Price - Cost Price)
Loss = (Cost Price - Selling Price) */
public class CalculateProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price : ");
        int CP = sc.nextInt();
        System.out.print("Enter the selling price : ");
        int SP = sc.nextInt();
        int Difference = Math.abs(SP - CP);
        if (CP<SP) {
            System.out.println(Difference+" Profit");
        }else if (CP>SP) {
            System.out.println(Difference+" Loss");
        } 
        sc.close();
    }
}
