package BasicsOfJava;
/*Problem Statement: Given two integers m and n. The goal is simply to swap their values in the memory block and writing the java code demonstrating approaches.

Illustration:

Input  : m=9, n=5
Output : m=5, n=9
 
Input  : m=15, n=5
Output : m=5, n=15
Here 'm' and 'n' are integer value */
import java.util.Scanner;

public class Swaping2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Before Swapping : m="+m+" n="+n);
        int temp=m;
        m=n;
        n=temp;
        System.out.println("After Swapping : m=" + m + " n=" + n);
        sc.close();
    }
}
