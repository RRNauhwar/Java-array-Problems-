public class mergeTwosortedArrays {
    public static void main(String[] args) {
        int i,j;
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10};
        int [] arr3 = new int[arr1.length+arr2.length];
    for (i=0;i<5;i++) {
        arr3[i] = arr1[i];
    }
    for (i=0;i<5;i++) {
        arr3[i+5] = arr2[i]; 
    }
    for(i=0;i<10;i++) {
        System.out.print(arr3[i]+" ");
    }
    }
}
