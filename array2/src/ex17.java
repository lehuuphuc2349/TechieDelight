import java.util.Arrays;
import java.util.Scanner;

public class ex17 {
    static int Solve(int arr[], int size){
        int left[] = new int[size];
        int right[] = new int[size];
        left[0]=Integer.MIN_VALUE;
        right[size-1]=Integer.MAX_VALUE;
//        4 2 3 5 1 6 9 7
        for(int i=1; i<size; i++)
            left[i]=Math.max(left[i-1],arr[i-1]);
//        4 5 6 9
        for(int i=size-2; i>=0; i--){
            right[i]=Math.min(right[i+1],arr[i+1]);
//         7 6 1
        }
        for(int i=0; i<size-1; i++){
            if(left[i]<arr[i]&&arr[i]<right[i]){
//                return i;
//                System.out.println("Phuc dep trai");
                return i;
            }
        }
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size-2; j++){
                if(arr[i]!=arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return size;
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
