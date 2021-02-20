import java.util.Scanner;

public class ex49 {
    static int Solve(int arr[], int size, int left, int right){
        if(left>right) return left;
        int mid=(left+right)>>1;
        System.out.println(mid);
        if(arr[mid]==mid){
//            0 1 2 6 9 11 15
            return Solve(arr,size, mid+1,right);
        }else
            return Solve(arr,size,left,mid-1);
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
        int right=size-1,left=0;
        System.out.println("Smallest missing elements is " + Solve(arr,size,left,right));
    }
}
