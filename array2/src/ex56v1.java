import java.awt.*;
import java.util.*;
import java.util.List;

public class ex56v1 {
    static void Solve(int arr[], int size){
        Arrays.sort(arr);
        System.out.println("Result ceil: " + (arr[size-1]+1) + ", floor: " + (arr[0]-1) + " ");
    }
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter size of the array:");
//        int size = in.nextInt();
//        System.out.println("Enter elements of the array:");
//        int arr[] = new int[size];
//        for(int i=0; i<size; i++){
//            arr[i] = in.nextInt();
//        }
//        Arrays.sort(arr);
//        Stack<Integer> stack = new Stack<>();
//        stack.add(arr);
//        System.out.println(stack.pop());
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
