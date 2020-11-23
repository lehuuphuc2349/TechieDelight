import java.util.Arrays;
import java.util.Scanner;

public class ex46 {
    static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] reverseArray(int arr[], int i, int j) {
        if (i >= j) {
            return arr;
        }
        swap(arr, i, j);
        return reverseArray(arr, i + 1, j - 1);
    }
    static void reverse(int arr[], int i, int j, int m){
        if(m>j-i+1){
            return;
        }
        for(int k=i; k<=j; k=k+m){
            if(k+m-1<=j){
                reverseArray(arr,k,k+m-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("INPUT M CONTINUE:");
        int m = input.nextInt();
        int i = input.nextInt();
        int j = input.nextInt();
        System.out.println("Before: " + Arrays.toString(arr));
        reverse(arr,i,Math.min(j,arr.length-1),m);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
