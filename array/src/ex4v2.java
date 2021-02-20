import java.util.Arrays;
import java.util.Scanner;

public class ex4v2 {
    static void Solve(int arr[]){
        int k=0;
        for(int value:arr){
            if(value==0){
               arr[k++]=0;
            }
        }
        for(int i=k; k<arr.length; i++){
            arr[k++]=1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENTS OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i]+=input.nextInt();
        }
        System.out.println("BEFORE: " + Arrays.toString(arr));
        Solve(arr);
        System.out.println("AFTER: " + Arrays.toString(arr));
    }
}
