import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ex55 {
    static void Solve(int arr[], int size){
//        int rank[] = new int[size];
//        int k=0;
//        Arrays.sort(arr);
////        1 6 8 10 12 15 20
//        for(int i=1; i<=size; i++){
//            rank[k++]=i;
//        }
//        for(int i=0; i<size; i++){
//            if(Integer.valueOf(arr[i])==rank[i]){
//                System.out.print(arr[i]);
//            }
//        }
        Map<Integer, Integer> tree = new TreeMap<>();
        for(int i=0; i<size; i++){
            tree.put(arr[i],i);
        }
        int rank=1;
        for(int i: tree.values()){
            System.out.println(i);
        }
        for(int value: tree.values()){
           arr[value]=rank++;
        }
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
        System.out.println("Array: " + Arrays.toString(arr));
        Solve(arr,size);
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
