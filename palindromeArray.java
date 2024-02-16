import java.util.Scanner;

public class palindromeArray {
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
        isPalindrome(arr);
        }
        public static void isPalindrome (int[] arr) {
           
                int count = 0;
                for (int i=0,j=arr.length-1;i<j;i++,j--){
                if (arr[i]==arr[j]){
                count ++; }
            
                }
                if (count==arr.length/2)
                System.out.println("Palindrome");
                else 
                System.out.println("Not Palindrome");
            }
        }

