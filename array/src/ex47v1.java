import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex47v1 {
    static void Solve(int arr[], int k, int size){
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        for(int i=0; i<size; i++){
            while(i+1<size&&arr[i]==arr[i+1]){
                i++;
            }
            if(set.contains((arr[i]-k)))
                System.out.println("("+arr[i]+","+(arr[i]-k)+")");
            if(set.contains(arr[i]+k))
                System.out.println("("+arr[i]+","+(arr[i]-k)+")");
            set.add(arr[i]);
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
        System.out.println("Enter given diff: ");
        int k = in.nextInt();
        Solve(arr,k, size);
    }
}
