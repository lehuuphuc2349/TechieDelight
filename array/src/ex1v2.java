import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex1v2 {
//    USING MAP HASHING
    static void Solve(int arr[], int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++) {
            if(map.containsKey(sum - arr[i])) {
                System.out.println("PAIR FOUND AT INDEX " + map.get(sum-arr[i]) + " and " + i);
            }
            map.put(arr[i],i);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENTS OF THE ARRAY");
        int arr[] = new int[size];
        for(int i = 0 ; i < size; i++) {
            arr[i] += input.nextInt();
        }
        System.out.println("INPUT GIVEN SUM:");
        int sum = input.nextInt();
        Solve(arr,sum);
    }

}
