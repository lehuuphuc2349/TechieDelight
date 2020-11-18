import java.util.*;

public class ex39 {
    static int Solve(int arr[]){
       int n=arr.length;
       int water=0;
       int left[]=new int[n-1];
       left[0]=Integer.MIN_VALUE;
       for(int i=1; i<n-1; i++){
           left[i]=Integer.max(left[i-1],arr[i-1]);
       }
       int right=Integer.MIN_VALUE;
       for(int i=n-2; i>=1; i--){
           right=Integer.max(right,arr[i+1]);
           if(Integer.min(left[i],right)>arr[i]){
               water+=Integer.min(left[i],right)-arr[i];
           }
       }
       return water;
    }
    static void Sorting(int arr[]){
        Stack<Integer> stack = new Stack<>();
        for(int value : arr){
            stack.push(value);
        }
        Collections.sort(stack);
        int end, begin=0;
        
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
        System.out.println("Maximum amount of water is a: " + Solve(arr));
    }
}
