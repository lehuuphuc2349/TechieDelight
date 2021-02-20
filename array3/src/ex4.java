import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    static void leftRotate(int arr[], int size){
        int i,temp;
        temp=arr[0];
        for(i=0; i<size-1; i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
    }
    static void rightRotate(int arr[], int size){
//        int i,temp;
//        int k=0;
//        for(i=size-1; i>0; i++){
//            arr[i]=arr[]
//        }
        int i,temp;
        temp=arr[size-1];
        for(i=size-1; i>0; i--){
//            1 2 3 4 5
//            5 -> 4 ,
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    static void solve(int arr[], int size, int d){
        for(int i=0; i<d; i++){
            rightRotate(arr,size);
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
        System.out.println("Enter d:");
        int d = in.nextInt();
        solve(arr,size,d);
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
