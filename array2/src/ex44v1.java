import java.util.Scanner;

public class ex44v1 {
    static int Solve(int arr[], int size){
        int left=0, right=size-1;
        while(left<=right){
            if(arr[left]<arr[right])
                return left;
            int mid=(left+right)/2;
            int next=(mid+1)%size, prev=(mid-1+size)%size;
            if(arr[mid]<arr[next]&&arr[mid]<=arr[prev]){
                return mid;
            }
            else if(arr[mid]<arr[right]){
               right=mid-1;
            }
//            else if(arr[left]>=arr[mid]){
//                left=mid+1;
//            }
            else if(arr[mid]>=arr[mid]){
                left=mid+1;
            }
        }
        return-1;
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
        System.out.println("Result is a: " + Solve(arr,size));
    }
}
