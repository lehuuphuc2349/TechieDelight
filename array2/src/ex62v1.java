import java.util.Scanner;

public class ex62v1 {
    static int Solve(int arr[], int size, int sum){
        if(sum==0){
            return 1;
        }
        if(size<0||sum<0){
            return 0;
        }
        int include=Solve(arr,size-1,sum-arr[size]);
        int exclude=Solve(arr,size-1,sum);
        return Integer.max(include,exclude);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the arary:");
        int arr[] = new int[size];
//        1 2 3 0 1 2 1 2 1 2
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter sum:");
        int sum = in.nextInt();
        Solve(arr,size-1,sum);
    }
}
