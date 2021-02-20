import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex44v2 {
    static boolean Solve(int arr[], int sum){
        Map<Integer, Integer> map = new HashMap<>();
//        for(int value : arr){
//            map.put(value);
//        }
        for(int i=0; i<arr.length; i++)
            map.put(arr[i],i);
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int value=sum-(arr[i]+arr[j]);
                if(map.containsKey(value)){
                    if(map.get(value)!=i && map.get(value)!=j){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = in.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("INPUT SUM:");
        int sum = in.nextInt();
        System.out.println(Solve(arr,sum)?"Triplet Exists":"Triplet Don't Exists");
        Map<Integer, Integer> map = new HashMap<>();
        map.put(10,1);
        System.out.println(map.get(10));
    }
}
