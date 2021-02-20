import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ex16v1 {
    static int Solve(int arr[], int size){
//        int sum=IntStream.of(arr).sum();
////        (size-1) + size * (size-1)/2 =
////        return (size-1)+size*(size-1)/2 - sum;
//        System.out.println(sum);
//        return (size+1)+size*(size-1)/2 - sum;

        int sum=Arrays.stream(arr).sum();
        int sum1=IntStream.of(arr).sum();
        System.out.println(sum);
        System.out.println(sum1);
        return (size+1)+size*(size+1)/2-sum1;
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
        if(Solve(arr,size)!=-1) System.out.println("Result is a: " + Solve(arr,size));
    }
}
