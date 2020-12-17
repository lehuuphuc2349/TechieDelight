import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    static int[] reverseA(int arr[], int size, int d){
        int A[] = new int[d];
        for(int i=0; i<d; i++){
            A[i]=arr[i];
        }
        return A;
    }
    static int[] reverseB(int arr[], int size, int d){
        int B[] = new int[size-d];
        for(int i=d; i<=size-1; i++){
//            1 2 3 4 5 6 7
//            2 3 4 5 6 7 1

//            1 2 3 4 5 6 7
//            7 1 2 3 4 5 6
            B[i]=arr[i];
        }
        return B;
    }
    static void leftRotate(int arr[], int size, int d){
        reverseArry(arr,size,0,d-1);
        reverseArry(arr,size,d,size-1);
        reverseArry(arr,size,0,size-1);
    }
    static void reverseArry(int arr[], int size, int start, int end){
        int temp=0;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
    }
    static void Solve(int arr[], int size, int d){
//        int A[] = reverseA(arr,size,d);
//        int B[] = reverseB(arr,size,d);
//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(B));
        System.out.println("Before: " + Arrays.toString(arr));
        leftRotate(arr,size,d);
        System.out.println("After: " + Arrays.toString(arr));
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
        Solve(arr,size,d);
    }
}
