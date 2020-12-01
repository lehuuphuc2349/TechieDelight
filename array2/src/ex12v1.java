import java.util.Arrays;
import java.util.Scanner;

public class ex12v1 {
    static void Solve(int arr[], int size){
//        1 -2 6 4 -3 2 -4 -3
        int maxLen=0;
        int currLen=1;
        int endIndex=0;
        for(int i=1; i<size; i++){
            if(arr[i]*arr[i-1]<0){
                currLen++;
//                dp [1][2]
                if(currLen>maxLen){
                    maxLen=currLen;
                    endIndex=i;
                }
            }
            else currLen=1;
        }
//        -2 -1 0 1 2 3 1 -1
//        -1 0 1 -2 3 4 -5 -6 -2
//        int subArr[] = Arrays.copyOfRange(arr,(maxLen-currLen+1), endIndex+1);
        int subArr[] = Arrays.copyOfRange(arr,(endIndex-maxLen+1),endIndex+1);
        System.out.println(Arrays.toString(subArr));
//        System.out.println(endIndex);
//        System.out.println(maxLen);
//        System.out.println(currLen);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the arraY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        Solve(arr,size);
    }
}
