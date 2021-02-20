import java.util.Arrays;
import java.util.Scanner;

public class ex8v1 {
    static void Solve(int arr[], int size){
        Arrays.sort(arr);
        for(int i=0; i<=(size-1)/2; i++){
            for(int j=size-1; j>(size-1)/2; j--){
                int k=j-1;
                if(k!=i) {
                    System.out.println(arr[i] + " " + arr[k] + " " + arr[j]);
                }
            }
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
