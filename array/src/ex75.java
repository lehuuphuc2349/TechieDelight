import java.util.*;

public class ex75 {
    static void Solve(int arr[], int size){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<size; i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//            }else map.put(arr[i],1);
            int key=arr[i];
            int value=0;
            if(map.containsKey(key)){
                value=map.get(key);
                map.put(key,value+1);
            }else map.put(key,1);
//            if(map.get(key)%2!=0){
//                System.out.println(key);
//            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<size; i++){
            if(map.get(arr[i])%2!=0){
                set.add(arr[i]);
            }
        }
        System.out.println("Result : " + set);
//        for(int value : map.values()){
//            if(value%2!=0)
//                System.out.println(map.);
//        }
//        for(Integer value : map.keySet()){
//            if(value.get){
//                System.out.println(map);
//            }
//        }
//        for(int i=0; i<map.size(); i++){
//            if(map.containsKey(arr[i])&&map.get(arr[i])%2!=0){
//                System.out.println(map.keySet(map.get()));
//            }
//        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        Solve(arr,size);
    }
}
