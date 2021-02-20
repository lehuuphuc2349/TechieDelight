import java.util.*;

public class ex56 {
    static int Solve(int arr[], int size, int left, int right){
        int mid=(left+right)>>1;
        if((mid==0||arr[mid-1]<=arr[mid])&&(mid==size-1||arr[mid+1]<=arr[mid]))
            return mid;
//        if(arr[mid-1]>0&&arr[mid+1]>arr[0]+arr[mid]){
//            return Solve(arr,size,mid+1,right);
//        }
//        else{
//            return Solve(arr,size,mid,left+1);
//        }
        if(mid-1>=0&&arr[mid-1]>arr[mid]){
            return Solve(arr,size,left,mid-1);
        }
        return Solve(arr,size,mid+1,right);
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
        System.out.println("Result is a:  " + arr[Solve(arr,size,0,size-1)]);
    }
}
