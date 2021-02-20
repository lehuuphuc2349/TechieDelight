import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ex2v2 {
    static <K,V> void Insert(Map<K, List<V>> hashMap, K key, V value){
        if(!hashMap.containsKey(key)){
            hashMap.put(key,new ArrayList<>());
        }
        hashMap.get(key).add(value);
    }
    static void printSubArray(int arr[], int i, int j){
        System.out.println(IntStream.range(i,j+1).mapToObj(k->arr[k]).collect(Collectors.toList()));
    }
    static void Solve(int arr[], int size, int sum){
        Map<Integer, List<Integer>> hashMap = new HashMap<>();
        Insert(hashMap,0,-1);
        int sumSoFar=0;
        for(int i=0; i<size; i++){
            sumSoFar+=arr[i];
            if(hashMap.containsKey(sumSoFar-sum)){
                List<Integer> list = hashMap.get(sumSoFar-sum);
                for(Integer value : list){
                    printSubArray(arr,value+1,i);
                }
            }
            Insert(hashMap,sumSoFar,i);
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
        System.out.println("Enter sum:");
        int sum = in.nextInt();
        Solve(arr,size,sum);
    }
}
