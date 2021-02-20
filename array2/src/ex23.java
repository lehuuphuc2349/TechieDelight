import java.util.Arrays;
import java.util.Scanner;

public class ex23 {
//    static void rotateLeftByOne(int arr[], int size){
//        int first=arr[0];
//        for(int i=0; i<size-1; i++){
//            arr[i]=arr[i+1];
//        }
//        arr[size-1]=first;
//    }
//    static void Solve(int arr[], int size){
//        for(int i=0; i<size; i++){
//            rotateLeftByOne(arr,size);
//        }
//    }
    static void rotateLeftByOne(int arr[], int size){
        int first=arr[0];
        for(int i=0; i<size-1; i++){
            arr[i]=arr[i+1];
        }
        arr[size-1]=first;
    }
    static void Solve(int arr[], int size, int r){
        for(int i=0; i<r; i++){
            rotateLeftByOne(arr,size);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the arraY:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter r:");
        int r = in.nextInt();
        Solve(arr,size,r);
        System.out.println("Result : " + Arrays.toString(arr));
    }
}
