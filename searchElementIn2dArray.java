import java.util.Scanner;

public class searchElementIn2dArray {
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
        System.out.println("Enter the element you wanna search: ");
        int a = input.nextInt();
        int count = 0;
        for (i=0;i<rows;i++) {
            for (j=0;j<columns;j++) {
                if (a==arr[i][j]){
                    count ++;
                }
            }
        }
        if (count>0) {
            System.out.println("Present");
        }
        else {
            System.out.println("Not Present");
        }
    }
}
