import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex56 {
    static void Solve(int arr[], int size, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        int temp=sum;
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]+arr[j]+(sum-arr[i]+arr[j])<=sum)
                if(map.containsKey(sum-(arr[i]+arr[j]))){
                    System.out.println(arr[j] + " " + arr[i] + " " + (sum-(arr[i]+arr[j])));
                }
                map.put((arr[i]+arr[j]),i);
            }
        }
        for(int i=0; i<size-1; i++){

        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER SIZE OF THE ARRAY:");
        int size = in.nextInt();
        System.out.println("ENTER ELEMENTS OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("ENTER SUM GIVEN:");
        int sum = in.nextInt();
        Solve(arr,size,sum);
    }
}
