import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    static void rotateByOne(int arr[], int size){
        int i, temp;
        temp=arr[0];
        for(i=0; i<size-1; i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
    }
    static void solve(int arr[], int size, int d){
        for(int i=0; i<d; i++){
            rotateByOne(arr,size);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the arraY:");
        int size = in.nextInt();
        System.out.println("Enter eleemnts of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter d: ");
        int d = in.nextInt();
        System.out.println("Before: " + Arrays.toString(arr));
        solve(arr,size,d);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
