import java.util.Arrays;
import java.util.Scanner;

public class ex67 {
    static void Solve(int arr[], int size){
        if(size<2){
            System.out.println("No Pair");
        }
        int min=Integer.MAX_VALUE;
        int i=0, j=0;
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        while(low<high){
           if(Math.abs(arr[low]+arr[high])<min){
               min=Math.abs(arr[low]+arr[high]);
               i=low;
               j=high;
           }
           if(min==0)
               break;
           if(arr[high]+arr[low]<0)
               low++;
           else high--;
        }
        System.out.println("Pair: "+arr[i]+","+arr[j]);
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
