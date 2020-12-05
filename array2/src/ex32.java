import java.util.Arrays;
import java.util.Scanner;

public class ex32 {
    static void Solve(int arr[], int size, int k){
        Arrays.sort(arr);
        int result = arr[k-1];
        System.out.println("Result is a: " + result);
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
        System.out.println("Enter k :");
        int k = in.nextInt();
        Solve(arr,size,k);
    }
}
