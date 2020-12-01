import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex11v1 {
    static void Solve(int arr[], int size, int k){
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<size; i++){
            if(mp.containsKey(arr[i])&&i-mp.get(arr[i])<=k)
                System.out.println("Duplicates Found");
            else mp.put(arr[i],i);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the arraY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter k:");
        int k = in.nextInt();
        Solve(arr,size,k);
    }
}
