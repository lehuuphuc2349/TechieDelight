import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex32v2 {
    static void Solve(int arr[], int sumGiven){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0; i<arr.length; i++){
           sum+=arr[i];
           if(map.containsKey(sumGiven-sum)){
               System.out.print("SubArray is found at:[" + (map.get(sumGiven-sum)+1) + "," + (i-1) +"]");
               return;
           }
           map.put(sum,i);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0 ;i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("INPUT SUM GIVEN:");
        int sumGiven = input.nextInt();
        Solve(arr,sumGiven);
    }
}
