import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex60 {
    static void Solve(int arr[], int size){
        Set<Integer> set = new HashSet<>();
        for(int value : arr){
            set.add(value);
        }
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
               if(arr[i]==arr[j] && arr[i+1]==arr[j-1]){
                   System.out.println(arr[i] + "," + arr[i+1] + "||" + arr[j-1] + "," + arr[j]);
               }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
//        int arr[][] = {{3,4},{1,2},{5,2},{7,10},{4,3},{2,5}};
//        for(int i=0; i<size; i++){
//            for(int j=0; j<size-1; j++){
//
//            }
//        }
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        Solve(arr,size);
    }
}
