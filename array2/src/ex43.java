import java.util.Arrays;
import java.util.Scanner;

public class ex43 {
    static void Solve(int arr[], int size){
//        for(int i=0; i<size; i++){
//            if(arr[i]<0){
//                int j=
//                int temp=arr[i];
//            }
//        }
        int k=0;
        for(int i=0; i<=size-1; i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int [size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        Solve(arr,size);
        System.out.println(Arrays.toString(arr));
    }
}
