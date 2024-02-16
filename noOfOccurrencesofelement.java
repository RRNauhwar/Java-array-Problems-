import java.util.Scanner;
public class noOfOccurrencesofelement {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int [n];
        System.out.println("Enter the elements of arrays: ");
        for(int i=0;i<n;i++) {
           arr[i] = input.nextInt();
        }
        System.out.println("Enter the element you wanna find: ");
        int a = input.nextInt();
        System.out.println(a+" occurs "+getOccurrence(a, arr)+" times.");
    }
    public static int getOccurrence(int a, int[] arr) {
        int count = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==a) {
                count ++;
            }
        }
            return count;
    }
}