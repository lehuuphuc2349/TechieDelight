import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex30 {
    static class pair{
        private int first;
        private int second;
        pair(int x, int y){
            this.first=x;
            this.second=y;
        }
        @Override
        public String toString() {
            return first +  " " + second;
        }
    }
    static void Solve(int arr[], int size){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<size; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else mp.put(arr[i],1);
        }
        System.out.println("Result: ");
        for(int value : mp.keySet()){
            if(mp.get(value)%2==1)
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
