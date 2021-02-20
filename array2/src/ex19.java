import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ex19 {
    static void Solve(int arr[], int size){
        Set<Integer> set = IntStream.of(arr).boxed().collect(Collectors.toSet());
        int maxLen=1;
//        2 0 6 1 5 3 7
        for(int value : arr){
//       => 0 1 2 3 5 6 7
            if(!set.contains(value-1)){
                int len=1;
                    while(set.contains(value+len)){
                        len++;
                    }
                    maxLen=Math.max(maxLen,len);
            }
        }
        System.out.println(maxLen);
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
