import java.util.*;

public class ex3v1 {
//    USING MULTIMAP
    static <K,V> void insert(Map<K, List<V>> hashMap, K key, V value) {
        if(!hashMap.containsKey(key))
            hashMap.put(key,new ArrayList<>());
        hashMap.get(key).add(value);
    }
    static void Solve(int arr[]) {
        Map<Integer,List<Integer>> hashMap = new HashMap<>();
        insert(hashMap,0,-1);
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
            if(hashMap.containsKey(sum)){
                List<Integer> list = hashMap.get(sum);
                for(Integer value: list){
                    System.out.println("SUBARRAY ["+(value+1)+"..."+i+"]");
                }
            }
            insert(hashMap,sum,i);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENTS OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i]+=input.nextInt();
        }
        Solve(arr);
    }
}
