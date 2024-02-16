import java.util.Scanner;
public class deleteElementinArray {
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
        System.out.println("Enter the position of that array: ");
        int pos = input.nextInt();
        for (i=pos-1;i<n-1;i++) {
            arr[i] = arr[i+1]; 
        } 
        n--;
        for (i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
