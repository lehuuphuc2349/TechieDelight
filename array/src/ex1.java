import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
//    UNSORTED ARRAY
    static void Solve(int arr[], int sum) {
       for(int i = 0; i < arr.length-1; i++) {
           for(int j = 0; j < arr.length; j++) {
              if(arr[i] + arr[j] == sum)  {
                  System.out.println("Pair Found at index " + i + " and " + j + "(" + arr[i] + " + " + arr[j] +")");
              }
           }
       }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF ARRAY:");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("INPUT ELEMENTS OF THE ARRAY:");
        for(int i = 0; i < size; i++) {
            arr[i] += input.nextInt();
        }
        System.out.println("INPUT GIVEN SUM:");
        int sum = input.nextInt();
        Solve(arr,sum);
    }
}
