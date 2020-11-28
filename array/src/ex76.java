import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex76 {
    static void Solve(int arr[], int size){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<size; i++){
            int value = Math.abs(arr[i]);
            set.add(value);
        }
        System.out.println("Result: " + set.size());
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
