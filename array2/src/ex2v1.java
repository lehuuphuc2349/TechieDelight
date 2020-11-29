import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ex2v1 {
    static void print(int arr[], int i, int j){
        System.out.println(IntStream.range(i,j+1).mapToObj(k->arr[k]).collect(Collectors.toList()));
    }
    static void Solve(int arr[], int size, int sum){
        for(int i=0; i<size; i++){
            int sumSoFar=0;
            for(int j=i; j<size; j++){
                sumSoFar+=arr[j];
                if(sumSoFar==sum){
                    print(arr,i,j);
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
        System.out.println("Enter sum: ");
        int sum = in.nextInt();
        Solve(arr,size,sum);
    }
}
