import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt(),sum=10;
        int[] array = new int[10];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<size; i++)  {  
            //reading array elements from the user   
            array[i]=sc.nextInt();  
        }  
        System.out.println("Array elements are: ");  
        // accessing array elements using the for loop  
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < size; i++) {
            int currentSum = array[i];

            if (currentSum == sum) {
                System.out.println("Sum found at indexe "
                        + i);
                
            } else {
                // Try all subarrays starting with 'i'
                for (int j = i + 1; j < size; j++) {
                    currentSum += array[j];

                    if (currentSum == sum) {
                        System.out.println(
                                "Sum found between indexes " + i+ " and " + j);
                        
                    }
                }
            }
        }
    }
}
