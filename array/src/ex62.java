import java.util.Scanner;

public class ex62 {
    static void Solve(int arr[], int size, int k){
        int ans=0;
        for(int i=0; i<=size-k; i++){
            for(int j=i+1; j<i+k; j++){
               if(arr[i]==arr[j]){
                   break;
               }
               else ans=arr[j];
            }
        }
        System.out.println("Result: " + ans);
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
        System.out.println("Enter k:");
        int k = in.nextInt();
        Solve(arr,size,k);
    }
}
