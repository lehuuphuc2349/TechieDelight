import java.util.Arrays;
import java.util.Scanner;

public class ex21 {
    static void Solve(int arr[], int size){
        int sumSoFar=0, sum=0;
        Arrays.sort(arr);
        int begin=1, end=arr[size-1];
        while(begin<=end){
            sumSoFar+=begin;
            begin++;
        }
        System.out.println(sumSoFar);
        for(int i=0; i<size; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        int result=sumSoFar-sum;
        System.out.println(result==0?(arr[size-1]+1):result);
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
