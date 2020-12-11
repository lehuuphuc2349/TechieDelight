import java.util.Scanner;

public class ex57 {
    static int getCeil(int arr[], int size, int low, int high, int x){
        if(x<=arr[low]){
            return arr[low];
        }
        if(x>arr[high]){
            return arr[high];
        }
        int mid=(low+high)>>1;
        if(arr[mid]==x){
           return arr[mid];
        }
        else if(arr[mid]<x){
            return getCeil(arr,size,mid+1,high,x);
        }else{
            return getCeil(arr,size,low,mid,x);
        }
    }
    static int getFloor(int arr[], int size, int low, int high, int x){
        if(x<arr[low]){
            return -1;
        }
        if(x>=arr[high]){
            return arr[high];
        }
        int mid=(low+high)>>1;
        if(mid==low){
            return arr[low];
        }
        if(arr[mid]==x){
            return arr[mid];
        }
        else if(arr[mid]<x){
            return getFloor(arr,size,mid,high,x);
        }
        else {
            return getFloor(arr,size,low,mid-1,x);
        }
    }
    static void Solve(int arr[], int size, int begin, int end){
        for(int i=begin; i<=end; i++){
            System.out.printf("Number %2d: ", i);
            System.out.printf("Ceiling is : " + getCeil(arr,size,0,size-1,i));
            System.out.printf(" Floor is : " + getFloor(arr,size,0,size-1,i));
            System.out.println();
        }
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
        System.out.println("Input begin and end:");
        int begin=in.nextInt(), end=in.nextInt();
        Solve(arr,size,begin,end);
        int k=in.nextInt();
        System.out.println("Enter size      ");
    }
}
