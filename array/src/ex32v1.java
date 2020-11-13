import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex32v1 {
    static boolean Solve(int arr[], int sumGiven){
        Set<Integer> set = new HashSet<>();
        set.add(arr[0]);
        int maxSoFar=0;
        for(int i=1; i<arr.length; i++){
            maxSoFar+=arr[i];
            if(set.contains(maxSoFar-arr[i])){
                return true;
            }
            set.add(maxSoFar);
        }
        return false;
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
        System.out.println("INPUT SUM GIVEN:");
        int sumGiven = input.nextInt();
        if(Solve(arr,sumGiven)==true){
            System.out.println("SubArray is Exists");
        }else
            System.out.println("SubArray IS Not Exists");

    }
}
