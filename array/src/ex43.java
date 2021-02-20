import java.util.Arrays;
import java.util.Scanner;

public class ex43 {
    static void Solve(int arr[]){
        int x=-1,y=-1;
        int prev=arr[0];
        for(int i=1; i<arr.length; i++){
            if(prev>arr[i]){
                if(x==-1){
                    x=i-1;
                    y=i ;
                }
                else y=i;
            }
            prev=arr[i];
        }
        swap(arr,x,y);
    }
    static void swap(int arr[], int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
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
        Solve(arr);
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
