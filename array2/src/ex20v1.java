import java.util.Scanner;

public class ex20v1 {
    static void Solve(int arr[], int size){
        if(size<0) return;
        int maxSoFar=Integer.MIN_VALUE;
        System.out.print("=> ");
        for(int i=size-1; i>=0; i--){
            if(arr[i]>maxSoFar){
                maxSoFar=arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
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
        Solve(arr,size);
    }
}
