import java.util.Scanner;
public class reverseAnArray {
    public static void main(String[] args) {
        int i,j;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int [n];
        System.out.println("Enter the elements of arrays: ");
        for( i=0;i<n;i++) {
           arr[i] = input.nextInt();
        }
        for (i=0,j=n-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
