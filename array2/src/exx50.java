import java.util.Arrays;
import java.util.Scanner;

public class exx50 {
    static int getFloor(int arr[], int size, int value){
        int left=0, right=size-1;
        int floor=-1;
        while(left<=right){
            int mid=(left+right)>>1;
            if(arr[mid]==mid){
                return arr[mid];
            }else if(value<arr[mid]){
               right=mid-1;
            }else{
                floor=arr[mid];
                left=mid+1;
            }
        }
        return floor;
    }
    static int getCeil(int arr[], int size, int value){
        int left=0, right=size-1;
        int ceil=-1;
        while(left<=right){
            int mid=(left+right)>>1;
            if(arr[mid]==mid){
                return arr[mid];
            }else if(value<arr[mid]){
                ceil=arr[mid];
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ceil;
    }
    static void Solve(int arr[], int size, int begin, int end){
        for(int i=begin; i<=end; i++){
            System.out.print("Number: " +  i + " -> ");
            System.out.println("Ceiling is : " + getCeil(arr,size,i) + ", floor is : " + getFloor(arr,size,i));
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0 ;i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter range:");
        int begin=in.nextInt(), end=in.nextInt();
        Solve(arr,size,begin,end);
    }
}
