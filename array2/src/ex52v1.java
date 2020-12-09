import java.util.Scanner;

public class ex52v1 {
    static int Solve(int arr[], int size, int left, int right){
        if(arr[right]==0){
            return 0;
        }
        if(arr[left]==1){
            return (right-left+1);
        }
        int mid=(left+right)>>1;
        return Solve(arr,size,left,mid)+Solve(arr,size,mid+1,right);
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
        System.out.println("Result is a: " + Solve(arr,size,0,size-1));
    }
}
