import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    static void solve(int arr[], int size, int d){
        for(int i=0; i<d; i++){
            leftRotateByOne(arr,size);
        }
    }
    static void leftRotateByOne(int arr[], int size){
        int i, temp;
        temp=arr[0];
        for(i=0; i<size-1; i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        int d = in.nextInt();
        solve(arr,size,d);
        System.out.println(Arrays.toString(arr));
    }
}
