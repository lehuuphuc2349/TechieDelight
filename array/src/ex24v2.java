import java.util.Scanner;

public class ex24v2 {
    static void Solve(int arr[]){
        int maxSoFar=Integer.MIN_VALUE;
        int maxEndingHere=0;
        for(int value:arr){
            maxEndingHere+=value;
            maxEndingHere=Integer.max(maxEndingHere,value);
            maxSoFar=Integer.max(maxSoFar,maxEndingHere);
        }
        System.out.println("Result: " + maxSoFar);
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
        Solve(arr);
    }
}
