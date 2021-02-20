import java.util.Arrays;
import java.util.Scanner;

public class ex28v2 {
    static void Solve(int arr[]){
        int n=arr.length;
        Arrays.sort(arr);
            if ((arr[0] * arr[1]) >= arr[n - 1] * arr[n - 2]) {
                System.out.println("PAIR:(" + arr[0] + "," + arr[1] + ")");
            }
            if((arr[0] * arr[1]) <= arr[n - 1] * arr[n - 2]){
                System.out.println("PAIR:(" + arr[n - 2] + "," + arr[n - 1] + ")");
            }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        Solve(arr);
    }
}
