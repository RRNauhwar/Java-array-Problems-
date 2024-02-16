import java.util.Scanner;
public class minNdmaxinArray {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int [n];
        System.out.println("Enter the elements of arrays: ");
        for( i=0;i<n;i++) {
           arr[i] = input.nextInt();
        }
        int max = arr[0];
        for (i=0;i<n;i++) {
            if(arr[i]>=max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value is "+max);
        int min = arr[0];
        for (i=0;i<n;i++) {
            if (arr[i]<=min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value is "+min);
    }
}
