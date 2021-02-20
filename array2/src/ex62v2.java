import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex62v2 {
    static boolean Solve(int arr[], int size, int sum, Map<String, Boolean>mp){
        if(sum==0)
            return true;
        if(sum<0||size<0)
            return false;
//        String key=n+"|"+ 1 2 1 2 3 1 2 1 3 2 1 1 2
        String key=size+"|"+sum;
        if(!mp.containsKey(key)){
            boolean include=Solve(arr,size-1,sum-arr[size],mp);
            boolean exculde=Solve(arr,size-1,sum,mp);
            mp.put(key,include||exculde);
        }
        return mp.get(key);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        int sum = in.nextInt();
        Map<String, Boolean> mp = new HashMap<>();
        if(Solve(arr,size-1,sum,mp))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
