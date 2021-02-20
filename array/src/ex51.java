import java.util.Arrays;
import java.util.Scanner;

public class ex51 {
    static void Solve(int arr[],int size){
        int temp[] = new int[size];
        for(int i=0; i<size; i++){
            temp[arr[i]]=i;
        }
        for(int i=0; i<size; i++){
            arr[i]=temp[i];
        }
        System.out.println("Result: " + Arrays.toString(arr));
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
        System.out.println("Before: " + Arrays.toString(arr));
        Solve(arr,size);
    }
}
