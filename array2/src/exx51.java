import java.util.Scanner;

public class exx51 {
    static int Solve(int arr[], int size, int k){
        int left=0, right=size-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==mid){
                return arr[mid];
            }else if(mid-1>=left&&arr[mid-1]==k){
                return mid-1;
            }else if(mid+1<=right&&arr[mid+1]==k){
                return mid+1;
            }else if(k>arr[mid]){
                left=mid+2;
            }else {
                right=mid-2;
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
        System.out.println("Enter k:");
        int k = in.nextInt();
        int index=Solve(arr,size,k);
        if(index!=-1){
            System.out.println("Element " + k + " found at index: " + index);
        }else {
            System.out.println("Element not found in the array");
        }
    }
}

