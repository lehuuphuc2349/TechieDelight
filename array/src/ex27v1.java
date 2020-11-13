import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ex27v1 {
    static void Solve(int arr[], int k, int i, Stack<Integer> stack){
        if(stack.size()==k){
            System.out.println(stack);
            return;
        }
        for(int j=i; j<arr.length; j++){
            stack.add(arr[j]);
            Solve(arr,k,j,stack);
            stack.pop();
            while(j<arr.length-1&&arr[j]==arr[j+1]){
                j++;
            }
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
        System.out.println("INPUT LENGTH OF THE SUBARRAY:");
        int k = input.nextInt();
        Arrays.sort(arr);
        Stack<Integer> stack = new Stack<>();
        Solve(arr,k,0,stack);
    }
}
