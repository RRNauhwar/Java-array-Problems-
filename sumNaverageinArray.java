import java.util.Scanner;
public class sumNaverageinArray {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int [n];
        System.out.println("Enter the elements of arrays: ");
        for(int i=0;i<n;i++) {
           arr[i] = input.nextInt();
        }
        for (int i=0;i<n;i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of all arrays is "+sum);
        System.out.println("Average of all array elements is "+sum/n);
    }
    
}
