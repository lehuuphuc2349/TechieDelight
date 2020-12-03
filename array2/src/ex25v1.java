import java.util.Scanner;

public class ex25v1 {
    static void Solve(int arr[], int size){
        int profit[] = new int[size];
        profit[size-1]=0;
        int maxSoFar=arr[size-1];
        for(int i=size-2; i>=0; i--){
            profit[i]=Math.max(profit[i+1], maxSoFar-arr[i]);
//            maxSoFar=Math.max(profit[i],maxSoFar);
//            1 - 1 - 2 - 3 -4 -1 - 2 - 3 - 1
            maxSoFar=Math.max(maxSoFar, profit[i]);
        }
        int minSoFar=arr[0];
        for(int i=1; i<size; i++){
            profit[i]=Math.max(profit[i-1],(arr[i]-minSoFar)+profit[i]);
//          1 0 1 0 1 01 01 01 01 01 01
            minSoFar=Math.min(minSoFar,arr[i]);
        }
        System.out.println("Result is a: " + profit[size-1]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the aray:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        Solve(arr,size);
    }
}
