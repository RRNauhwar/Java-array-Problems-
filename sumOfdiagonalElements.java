import java.util.Scanner;

public class sumOfdiagonalElements {
    public static void main(String[] args) {
         int i,j;
         Scanner input = new Scanner (System.in);
        System.out.println("Enter the rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the columns");
        int columns = input.nextInt();
        int [][] arr = new int[rows][columns];
        System.out.println("Enter the elements: ");
        for (i=0;i<rows;i++) {
            for (j=0;j<columns;j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int sum = 0;
        for (i=0;i<rows;i++) {
            for (j=0;j<columns;j++) {
                if (i==j) {
                    sum = sum + arr[i][j];
                }
                
            }
        }
        System.out.println("The sum of diagonal Elements is "+sum);
    }
}
