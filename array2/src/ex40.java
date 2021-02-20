import java.util.*;

public class ex40 {
    static void Solve(int arr1[], int size1, int arr2[], int size2){
        Map<Integer,Integer> mp = new TreeMap<>();
        for(int i : arr1){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        int index=0;
        for(int i : arr2){
            int n=mp.getOrDefault(i,0);
            while(n-->0){
                arr1[index++]=i;
            }
            mp.remove(i);
        }
//        for(var entry : mp.entrySet()){
//            int count=entry.getValue();
//            while(count-->0){
//                first[index++]=entry.setValue();
//            }
//        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            int count=entry.getValue();
            while(count-->0){
                arr1[index++]=entry.getKey();
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array1:");
        int size1 = in.nextInt();
        System.out.println("Enter size elements of the array1:");
        int arr1[] = new int[size1];
        for(int i=0; i<size1; i++){
            arr1[i] = in.nextInt();
        }
        System.out.println("Enter size of the array2:");
        int size2 = in.nextInt();
        System.out.println("Enter elements of the array2:");
        int arr2[] = new int[size2];
        for(int i=0; i<size2; i++){
            arr2[i] = in.nextInt();
        }
        Solve(arr1,size1,arr2,size2);
        System.out.println(Arrays.toString(arr1));
    }
}
