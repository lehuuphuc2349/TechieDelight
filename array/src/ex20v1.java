import java.util.Arrays;
import java.util.Scanner;

public class ex20v1 {
    static void Solve(int arr[]){
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=1;
        for(int i=1; i<n; i++){
            left[i]=arr[i-1]*left[i-1];
        }
        right[n-1]=1;
        for(int i=n-2; i>=0; i--){
            right[i]=arr[i+1]*right[i+1];
        }
        for(int i=0; i<n; i++){
            arr[i]=left[i]*right[i];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        Solve(arr);
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
