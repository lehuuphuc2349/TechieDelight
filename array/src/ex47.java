import java.util.Scanner;

public class ex47 {
    static void Solve(int arr[], int k){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(Math.abs(arr[i]-arr[j])==k){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter given diff: ");
        int k = in.nextInt();
        Solve(arr,k);
    }
}
