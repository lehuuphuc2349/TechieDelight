import java.util.Arrays;
import java.util.Scanner;

public class ex50 {
    static void Solve(int arr[], int k){
        Arrays.sort(arr);
        System.out.println(k+ "'th smallest elements of the array is: " + arr[k]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter k'th elements: ");
        int k = in.nextInt();
        Solve(arr,k);
    }
}
