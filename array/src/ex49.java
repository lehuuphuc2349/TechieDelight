import java.util.Arrays;
import java.util.Scanner;

public class ex49 {
    static void Solve(int arr[], int size, int sum){
        Arrays.sort(arr);
        for(int i=0; i<=size-4; i++){
            for(int j=i+1; j<=size-3; j++){
                int k=sum-(arr[i]+arr[j]);
                int low=j+1, high=size-1;
                while(low<high){
                    if(arr[low]+arr[high]<k)
                        low++;
                    else if(arr[low]+arr[high]>k)
                        high--;
                    else{
                        System.out.println("("+arr[i]+","+arr[j]+","+arr[low]+","+arr[high]+")");
                        low++;
                        high--;
                    }
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
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter given sum:");
        int sum = in.nextInt();
        Solve(arr,size,sum);
    }
}
