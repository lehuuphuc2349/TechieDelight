import java.util.Arrays;
import java.util.Scanner;

public class ex63 {
    static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void Solve(int arr[], int size){
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        System.out.println("Result: " + arr[arr.length-1]+""+arr[arr.length-2]+""+arr[arr.length-3]+" , "
                            +arr[arr.length-1]+""+arr[arr.length-2]+""+arr[arr.length-4]);
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
        Solve(arr,size);
    }
}
