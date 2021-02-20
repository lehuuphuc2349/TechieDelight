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
//        int k=arr.length-1;
//        while(arr[i+1]+arr[i]!=0&&k>0){
//           arr[i+1]=arr[0];
//           arr[0]=arr[i+2];
//           arr[i+2]=arr[i+1];
//           k--;
//        }
        Solve(arr,dq,i-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,1};
        Arrays.sort(arr);
        Deque<Integer> dq = new ArrayDeque<>();
        Solve(arr,dq,arr.length-1);
    }
}
