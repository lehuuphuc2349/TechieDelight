import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex57 {
    static void Solve(int arr[], int size){
        if(size==0){
            System.out.println(Arrays.toString(arr));
        }
        Map<Integer, Integer> mp = new HashMap<>();
//        for(int i=0; i<size; i++){
//            for(int j=i; j<size; j++){
//                if(mp.containsKey(arr[j])){
//                    System.out.print(arr[j]);
//                }
//                else if(!mp.containsKey(arr[j])){
//                    break;
//                }
//                mp.put(arr[j],j);
//            }
//        }
        for(int v : arr){
            mp.put(v,mp.getOrDefault(v,0)+1);
        }
//        String temp=mp.toString();
//        System.out.println(temp);
        for(int i : arr){
            if(mp.containsKey(i)){
                int n=mp.get(i);
//                System.out.println(n);
                while(n--!=0){
                    System.out.print(i+" ");
                }
                mp.remove(i);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = in.nextInt();
        System.out.println("INPUT ELEMENTS OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        Solve(arr,size);
    }
}
