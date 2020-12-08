import java.util.Scanner;

public class ex45 {
    static int Solve(int arr[], int size, int k){
        if(size==0) return 0;
        int left=0, right=size-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(k==arr[mid])
                return mid;
            if(arr[mid]<arr[right]){
                if(k>arr[mid]&&k<=arr[right]){
                    left=mid+1;
                }else right=mid-1;
            }else{
                if(k>=arr[left]&&k<arr[mid]){
                    right=mid-1;
                }else left=mid+1;
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
        System.out.println("Enter target number:");
        int k = in.nextInt();
        System.out.println("Result is a: " + Solve(arr,size, k));
    }
}
