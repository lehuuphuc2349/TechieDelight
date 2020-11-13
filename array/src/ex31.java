import java.util.Arrays;
import java.util.Scanner;

public class ex31 {
    static int Solve(int arr[]){
        int maxSoFar=0, maxEndingHere=0, minEndingHere=0;
        for(int value : arr){
            int temp=maxEndingHere;
            maxEndingHere=Integer.max(value,Integer.max(value*maxEndingHere,value*minEndingHere));
            minEndingHere=Integer.min(value,Integer.min(value*temp,value*minEndingHere));
            maxSoFar=Integer.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
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
        System.out.println("Max Product is a: " + Solve(arr));
    }
}
