import java.util.Arrays;
import java.util.Scanner;

public class ex20v2 {
    static int Solve(int arr[], int n, int left, int i){
        if(i==n){
            return 1;
        }
        int curr = arr[i];
        int right = Solve(arr,n,left*arr[i],i+1);
        arr[i]=left*right;
        return curr*right;

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
        int length = arr.length;
        Solve(arr,length,1,0);
        System.out.println(Arrays.toString(arr));
    }
}
