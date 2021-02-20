import java.util.Arrays;
import java.util.Scanner;

public class ex16 {
    static int Solve(int arr[], int size){
        int miss=0;
        Arrays.sort(arr);
        if(size<0) return -1;
        for(int i=0; i<size-1; i++){
//            int j=i+1;
////            1 2 4 5
////            if(j>size-1){
////                j=0;
////            }
//            if(arr[j]-arr[i]!=1){
//                miss=arr[i]+1;
//                return miss;
//            }
            for(int j=i+1; j<size; j++){
                if(arr[j]-arr[i]>1){
                    miss=arr[i]+1;
                    break;
                }else{
                    miss=arr[0]-1;
                    break;
                }
            }
        }
//        System.out.println("Result : " + miss);
        return -1;
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
        if(Solve(arr,size)!=-1) System.out.println("Result : " + Solve(arr,size));
    }
}
