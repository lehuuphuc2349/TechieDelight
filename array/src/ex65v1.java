import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex65v1 {
    static int Solve(int arr[], int size){
        int minIndex=0;
        Set<Integer> set = new HashSet<>();
        for(int i=size-1; i>=0; i--){
            if(set.contains(arr[i])){
                minIndex=i;
            }
            else{
                set.add(arr[i]);
            }
        }
        return minIndex;
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
        if(Solve(arr,size)!=size) System.out.println("Minimum Index of repeating is: " + Solve(arr,size));
        else System.out.println("Invalid Input");
    }
}
