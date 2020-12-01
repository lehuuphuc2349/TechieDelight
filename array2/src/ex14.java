import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex14 {
    static void Solve(int arr[], int size){
        if(size<0) return;
        int count=1;
        Set<Integer>set = new HashSet<>();
        for(int value : arr){
            set.add(value);
        }
        for(int i=0; i<size-1; i++){
            if(set.contains(arr[i])){
                if(arr[i]>arr[i+1]){
                    count++;
                }
            }
        }
        System.out.println("Result : " + count);
//        int result=0;
//        for(int value : arr){
//            set.add(value);
//        }
//        int count=0;
//        for(int i=0; i<size-1; i++){
//            for(int j=i+1; j<size; j++){
//                int k=j++;
//                result=arr[i]>arr[j]?arr[j]<arr[k]?count==arr[i]:count=arr[j];
////                2 0 1 6 5 3 7 => [2 0 1 3]
//            }
//        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the arraY:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        Solve(arr,size);
    }
}
