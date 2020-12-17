import java.util.Arrays;
import java.util.Scanner;

public class ex4v1 {
    static void rightRotate(int arr[], int size, int start, int end){
        int temp=arr[size-1];
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void solve(int arr[], int size, int d){
        rightRotate(arr,size,0,d-1);
        rightRotate(arr,size,d,size-1);
        rightRotate(arr,size,0,size-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter d:");
        int d = in.nextInt();
        solve(arr,size,d);
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
