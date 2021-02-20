import java.util.Scanner;

public class ex31v1 {
    static void Solve(int arr[]){
        int maxSoFar=arr[0], maxEndingHere=arr[0], minEndingHere=arr[0];
        for(int i=1; i<arr.length; i++){
            int temp=minEndingHere;
            maxEndingHere=Integer.max(arr[i],Integer.max(arr[i]*maxEndingHere,arr[i]*minEndingHere));
            minEndingHere=Integer.min(arr[i],Integer.min(temp*arr[i],arr[i]*minEndingHere));
            maxSoFar=Integer.max(maxSoFar,maxEndingHere);
        }
        System.out.println("Max Prodcut is a: " + maxSoFar);
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
    }
}
