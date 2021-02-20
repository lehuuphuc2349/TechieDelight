import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ex20 {
    static void Solve(int arr[], int size){
        Stack<Integer> stack = new Stack<>();
        for(int value : arr){
            while(!stack.isEmpty()&&stack.peek()<value){
                stack.pop();
            }
            stack.push(value);
        }
//        System.out.println(stack.peek());
        while(!stack.isEmpty()){
            System.out.println(stack.pop() + " ");
        }
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
//        Solve(arr,size);
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(4);
//        stack.push(6);
//        stack.push(3);
//        stack.push(5);
//        stack.pop();
//        stack.pop();
//        stack.push(6);
//        System.out.println(stack.peek());
        Solve(arr,size);
    }
}
