import java.util.Scanner;

public class ex53 {
    static int Solve(int arr[], int size){
        int left=0, right=size-1;
        int diff=(arr[size-1]-arr[0])/size;
        while(left<=right){
            int mid=(right+left)>>1;
            if(mid+1<size&&arr[mid+1]-arr[mid]!=diff){
                return arr[mid+1]-diff;
            }
            if(mid-1>=0&&arr[mid]-arr[mid-1]!=diff){
//                5 7 9 11 15
                return arr[mid-1]+diff;
            }
            if(arr[mid]-arr[0]!=(mid-0)*diff){
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
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
        System.out.println("Result is : " + Solve(arr,size));
    }
}
