import java.util.Arrays;
import java.util.Scanner;

public class ex54v1 {
    static void Solve(int arr[], int size){
        int m=size+1;
        int total=m*(m+1)/2;
        int sum=Arrays.stream(arr).sum();
        System.out.println("Result is a: " + (total-sum));
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
