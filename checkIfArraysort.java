import java.util.Scanner;
public class checkIfArraysort {
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
        System.out.println("Increasing Sorted: "+ifArraysortedinIncreasing(arr));
        System.out.println("Decreasing Sorted: "+ifArraysortedinDecreasing(arr));
 }
 public static Boolean ifArraysortedinIncreasing(int[] arr) {
   for (int i=0;i<arr.length;i++) {
    for (int j=i+1;j<arr.length;j++) {
        if (arr[i]>arr[j])
        return false;
    }
}
return true;
 }
 public static Boolean ifArraysortedinDecreasing(int[] arr) {
    for (int i=0;i<arr.length;i++) {
        for (int j=i+1;j<arr.length;j++) {
            if (arr[i]<arr[j])
            return false;
        }
        
    }
    return true;
 }
}
