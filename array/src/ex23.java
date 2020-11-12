import java.util.Arrays;
import java.util.Scanner;

public class ex23 {
    static void Solve(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int diff=arr[arr.length-1]-arr[0];
        System.out.println("Result: " + diff);
        System.out.println("Pair("+arr[arr.length-1]+","+arr[0]+")");
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
