import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ex58 {
    static void Solve(int arr[], Deque<Integer> dq , int i){
        if(i<0){
            System.out.println(dq);
            return;
        }
        dq.addLast(arr[i]);
        Solve(arr,dq,i-1);
        dq.pollLast();
        while(i>0&&arr[i]==arr[i-1]){
            i--;
        }
        while(i<0&&arr[i]==arr[i+1]){
            i++;
        }
        Solve(arr,dq,i-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,1};
        Arrays.sort(arr);
        Deque<Integer> dq = new ArrayDeque<>();
        Solve(arr,dq,arr.length-1);
    }
}
