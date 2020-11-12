import java.util.Arrays;
import java.util.Scanner;

public class ex25 {
    static int Solve(int arr[]){
        int maxSoFar=0;
        int maxEndingHere=0;
        for(int value: arr){
            maxEndingHere=maxEndingHere+1;
            maxEndingHere=Integer.max(maxEndingHere,0);
            maxSoFar=Integer.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }
    static int KanadeCircle(int arr[]){
        Arrays.setAll(arr,i -> -arr[i]);
        int negMaxSum=Solve(arr);
        Arrays.setAll(arr,i -> -arr[i]);
        return Integer.max(Solve(arr),Arrays.stream(arr).sum() + negMaxSum);
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
        System.out.println("The sum of the subarray with the largest sum is: " + KanadeCircle(arr));
    }
}
