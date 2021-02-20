import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex55 {
    static int findDulicapte(int arr[], int size){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int value : arr){
            if(mp.containsKey(value)){
                mp.put(value,mp.get(value)+1);
            }else{
                mp.put(value,1);
            }
        }
        int dp=0;
        for(int value : mp.keySet()){
            if(mp.get(value)!=1){
               dp=value;
            }
        }
        return dp;
    }
    static int findMissNumber(int arr[], int size){
        int total=size*(size+1)/2;
        int sum=Arrays.stream(arr).sum()-findDulicapte(arr,size);
        int miss=total-sum;
        return miss;
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
        System.out.println("Duplicate: " + findDulicapte(arr,size) + ", missing number: " + findMissNumber(arr,size));
    }
}
