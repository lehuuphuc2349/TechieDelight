import java.util.Arrays;
import java.util.Scanner;

public class ex15 {
    static void Solve(int arr[], int size) {
        int mid=(size-1)/2;
        Arrays.sort(arr);
        for(int i=mid; i<size; i++){
            System.out.println(arr[i]);
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
        Solve(arr,size);
    }
}
