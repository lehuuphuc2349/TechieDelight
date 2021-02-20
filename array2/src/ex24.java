import java.util.Arrays;
import java.util.Scanner;

public class ex24 {
    static void rightRotateByOne(int arr[], int size){
        int last=arr[size-1];
        for(int i=size-2; i>=0; i--){
            arr[i+1]=arr[i];
        }
        arr[0]=last;
    }
    static void Solve(int arr[], int size, int k){
        for(int i=0; i<k; i++){
            rightRotateByOne(arr,size);
        }
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
        System.out.println("Enter k times:");
        int k = in.nextInt();
        Solve(arr,size,k);
        System.out.println("Result : " + Arrays.toString(arr));
    }
}
