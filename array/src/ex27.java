import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ex27 {
    static void Solve(int arr[], Deque<Integer> out, int k, int i, int n){
        if(out.size()==k){
            System.out.println(out);
            return;
        }
        for(int j=i; j<n; j++){
            out.addLast(arr[j]);
            Solve(arr,out,k,j,n);
            out.pollLast();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("INPUT LENGTH OF THE SUBARRAY: ");
        int k = input.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        Solve(arr, deque, k, 0, size);
    }
}
