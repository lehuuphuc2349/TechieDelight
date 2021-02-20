import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    static void Solve(int arr[]){
       for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
            }
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
