import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex59 {
    static void Solve(int arr[], int size){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int value : arr){
            if(mp.containsKey(value)){
                mp.put(value,mp.get(value)+1);
            }else{
                mp.put(value,1);
            }
        }
        for(int value : mp.keySet()){
            if(mp.get(value)!=1){
                System.out.print(value + " ");
            }
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
