import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex65 {
    static void Solve(int arr[], int size){
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Minimum index of repeating is " + i);
                    return;
                }
            }
        }
        System.out.println("No Number Repeating!!");
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
