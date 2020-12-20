import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex77 {
    static void printCombinations(int arr[], int i, int sum, int sumLeft){
        int prevNum=(i>0)?arr[i-1]:1;
        for(int k=prevNum; k<=sum; k++){
            arr[i]=k;
            if(sumLeft>k){
                printCombinations(arr,i+1,sum,sumLeft-k);
            }
            if(sumLeft==k){
                System.out.println(Arrays.stream(arr).limit(i+1).boxed().collect(Collectors.toList()));
            }
        }

    }
    static void Solve(int sum){
        int arr[] = new int[sum];
        int startingIndex=0;
        printCombinations(arr,startingIndex, sum, sum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter size of the araray:");
//        int size = in.nextInt();
//        System.out.println("Enter elements of the arraY:");
//        int arr[] = new int[size];
//        for(int i=0; i<size; i++){
//            arr[i] = in.nextInt();
//        }
        System.out.println("Enter sum: ");
        int sum = in.nextInt();
        Solve(sum);
    }
}
