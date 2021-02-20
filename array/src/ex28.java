import java.util.Scanner;

public class ex28 {
    static void Solve(int arr[]){
        int begin=0, end=0;
        int maxProduct=0, max=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                maxProduct=Math.max(arr[i]*arr[j],Integer.MIN_VALUE);
                if(max<maxProduct){
                    max = maxProduct;
                    System.out.println("Pair:("+arr[i]+","+arr[j]+")");
                }
            }
        }
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
