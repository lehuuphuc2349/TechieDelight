import java.util.Scanner;

public class ex59 {
    static void maxSumSubArray(int arr[], int aux[], int i, int j, int diff){
        int maxSoFar=arr[i];
        int maxEndingHere=arr[i];
        aux[i]=arr[i];
        for(int k=i+diff; k!=j; k+=diff){
            maxEndingHere=Integer.max(arr[k],maxEndingHere+arr[k]);
            maxSoFar=Integer.max(maxSoFar,maxEndingHere);
            aux[k]=maxSoFar;
        }
    }
    static void fillArray(int arr[], int leftMax[], int rightMax[], int leftMin[], int rightMin[], int size){
        maxSumSubArray(arr,leftMax,0,size-1,1);
        maxSumSubArray(arr,rightMax,size-1,0,-1);
        for(int i=0; i<size; i++){
            arr[i]=-arr[i];
        }
        maxSumSubArray(arr,leftMin,0,size-1,1);
        maxSumSubArray(arr,rightMin,size-1,0,-1);
        for(int i=0; i<size; i++){
            leftMin[i]=-leftMin[i];
        }
        for(int i=0; i<size; i++){
            rightMin[i]=-rightMin[i];
        }
        for(int i=0; i<size; i++){
            arr[i]=-arr[i];
        }
    }
    static int Solve(int arr[], int size){
//        int leftMax[] = new int[size], leftMin[] = new int[size],
//                rightMax[] = new int[size], rightMin[] = new int[size];
//        int k=0;
//        for(int value : arr){
//
//        } 1 2 3 4 5 - 1 3 6 10 15 - 1 4 10 20 35 - 1 5 15 35 70 - 1 6 21 56 126
        int leftMax[] = new int[size];
        int rightMax[] = new int[size];
        int leftMin[] = new int[size];
        int rightMin[] = new int[size];
        fillArray(arr,leftMax,rightMax,leftMin,rightMin,size);
        int maxAbsDiff=Integer.MIN_VALUE;
        for(int i=0; i<size-1; i++){
            int absDiff=Integer.max(Math.abs(leftMax[i]-rightMin[i+1]),
                    Math.abs(leftMin[i]-rightMax[i+1]));
            maxAbsDiff=Integer.max(maxAbsDiff,absDiff);
        }
        return maxAbsDiff;
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
//        Result = 19
        System.out.println("Result: " + Solve(arr,size));
    }
}
