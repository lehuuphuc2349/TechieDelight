import java.util.*;

public class ex28 {
//    4 3 6 2 6 4 2 3 4 3 3
//     => mp[4,1] => mp[4,get()+1]
/*      1 1 1 1 1
*       1 2 3 4 5 => 1 2 3 4 5, => 2 3 4 5, 3 6 10 15, 4 10 20 35, 5 15 35 70
*       1 3 6 10 15
*       1 4 10 20 35
*       1 5 15 35 70
* */
    static void Solve(int arr[], int size){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<size; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else mp.put(arr[i],1);
        }
        System.out.println(mp.size());
        System.out.println("Result:");
//        System.out.println(mp);
//        Set<Integer> set = new HashSet<>();
//        for(int i=0; i<size; i++){
//            if(mp.get(arr[i])%2!=0){
//                set.add(arr[i]);
//            }
//        }
        for(int value : mp.keySet()){
            if(mp.get(value)%2!=0)
                System.out.print(value + " ");
        }
        System.out.println();
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
        Solve(arr,size);
    }
}
