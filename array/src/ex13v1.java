import java.util.Arrays;
import java.util.Scanner;

public class ex13v1 {
    static void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void Solve(int arr[]){
        for(int i=1; i<arr.length; i+=2){
            if(arr[i-1]>arr[i]){
                swap(arr,i-1,i);
            }
            if(arr[i+1]<arr.length&&arr[i+1]>arr[i]){
                swap(arr,i+1,i);
            }
        }
        System.out.println("Result: " + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int sz = in.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[sz];
        for(int i=0; i<sz; i++){
            arr[i]=in.nextInt();
        }
        Solve(arr);
    }
}
