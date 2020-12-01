import java.util.*;

public class ex6 {
    static void Solve(int arr[], int size){
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<size; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else mp.put(arr[i],1);
        }
//        Set<Integer> set = new HashSet<>();
//        for(int value : arr){
//            set.add(value);
//        }
//        int curr=0;
//        for(int i=0; i<size; i++){
//            if(mp.containsKey(arr[i])&&curr!=arr[i]){
//                System.out.println("Element " + arr[i]+" appears "+mp.get(arr[i])+" times");
//                curr=arr[0];
//            }
//        }
            for(int value : mp.keySet()){
                System.out.println("Element " + value + " appears " + mp.get(value));
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
        Solve(arr,size);
    }
}
