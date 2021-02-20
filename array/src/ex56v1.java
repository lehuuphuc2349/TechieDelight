import java.util.Arrays;
import java.util.Scanner;

public class ex56v1{
    static void Solve(int arr[], int size, int sum){
        Arrays.sort(arr);
        for(int i=0; i<size-3; i++){
            int low=i+1, high=size-1;
            while(low<high){
                if(arr[i]+arr[low]+arr[high]>sum){
                    high--;
                }
                else {
                    for(int j=low+1; j<=high; j++){
                        System.out.println("("+arr[i]+","+arr[low]+","+arr[j]+")");
                    }
                    low++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER SIZE OF THE ARRAY:");
        int size = in.nextInt();
        System.out.println("ENTER ELEMENTS OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("ENTER SUM GIVEN:");
        int sum = in.nextInt();
        Solve(arr,size,sum);
    }
}
