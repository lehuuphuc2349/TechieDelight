import java.util.Arrays;
import java.util.Scanner;

public class ex74 {
//    static int findLeastSmallest(int arr[], int i, int size){
//        int min=Integer.MAX_VALUE;
//        for(int j=i+1; j<size-1; j++){
//           if(min>arr[j]){
//               min=arr[j];
//           }
//        }
//        return min;
//    }
    static void Solve(int arr[], int size) {
//        arr[size-1]=-1;
//        for(int i=0; i<size-1; i++){
//                if(arr[i]<findLeastSmallest(arr,i,size))
//                    arr[i]=findLeastSmallest(arr,i,size);
//                else arr[i]=-1;
//            }
//        System.out.println(Arrays.toString(arr));
//        }
        for(int i=0; i<size; i++){
            int diff=Integer.MAX_VALUE;
            int successcor=-1;
            for(int j=i+1; j<size; j++){
                if(arr[j]>arr[i]&&(arr[j]-arr[i]<diff)){
                    diff=arr[j]-arr[i];
                    successcor=arr[j];
                }
            }
            arr[i]=successcor;
        }
        System.out.println(Arrays.toString(arr));
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
        System.out.println(Arrays.toString(arr));
        Solve(arr,size);
    }
}
