import java.util.Scanner;

public class ex23v1 {
    static void Solve(int arr[]){
        int diff=Integer.MIN_VALUE;
        int begin=0, end=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                diff=Integer.max(diff,arr[j]-arr[i]);
                begin=arr[i];
                end=arr[j];
            }
        }
        System.out.println("Pair:("+begin+","+end+")");
        System.out.println("Result: " + diff);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size=input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        Solve(arr);
    }
}
