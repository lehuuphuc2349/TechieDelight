import java.util.Scanner;

public class ex54 {
    static int Solve(int arr[], int size){
        int right=size-1, left=0;
        int diff=(arr[size-1]-arr[0])/size;
        while(left<=right){
            int mid=(left+right)>>1;
            if(mid+1<size&&arr[mid+1]-arr[mid]!=diff){
                return arr[mid+1]-diff;
            }
            if(mid-1>=0&&arr[mid]-arr[mid-1]!=diff){
                return arr[mid-1]+diff;
            }
            if(arr[mid]-arr[0]!=(mid-0)*diff){
                right=mid-1;
            }
            else{
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
