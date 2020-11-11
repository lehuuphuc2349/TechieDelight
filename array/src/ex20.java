import java.util.Arrays;
import java.util.Scanner;

public class ex20 {
    static void Solve(int arr[]){
        int pro=1;
        for(int value: arr){
           pro*=value;
        }
        int k=0;
        for(int i=0; i<arr.length; i++){
           arr[k++]=pro/arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        Solve(arr);
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
