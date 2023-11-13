package BasicsOfJava;


import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        int a[] = { 3, 2, 1, 5 };
        System.out.println(a);
        Arrays.sort(a);
        System.out.println(a);
        for (int i = 1; i <= a.length; i++) {
            if (i!=a[i-1]) {
                System.out.println(i);
                break;
            }
        }
        
    }
}
