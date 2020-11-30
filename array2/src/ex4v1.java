import java.util.Scanner;

public class ex4v1 {
    static int Solve(int arr[], int size) {
        for (int i = 1; i < size; i++) {
            if (arr[i] == 1) {
                arr[i] += arr[i - 1];
            }
        }
//        0 0 1 0 1 1 1 0 1 1
        int count = 0;
        for (int i = size - 1; i >= 0; i--) {
            count = Math.max(arr[i], count);
            if (arr[i] != 0) {
                arr[i] = count;
            } else count = 0;
        }
        int maxCount = 0, maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                if (i == 0 && maxCount < arr[i + 1] + 1) {
                    maxCount = arr[i + 1] + 1;
                    maxIndex = i;
                } else if (i == size - 1 && maxCount < arr[i + 1] + 1) {
                    maxCount = arr[i + 1] + 1;
                    maxIndex = i;
                }
//                else if(maxCount<arr[i+1]+1+arr[i+1]+1){
//                    maxCount=arr[i+1]+1+arr[i+1]+1;
//
//                }
                else if (maxCount < arr[i - 1] + arr[i + 1] + 1) {
                    maxCount = arr[i - 1] + arr[i + 1] + 1;
                    maxIndex = i;
                }
            }
        }
        for (int i = 1; i < size; i++) {
            if (arr[i] != 0) {
                arr[i] = 1;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the arraY:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        if(Solve(arr,size)!=-1){
            System.out.println("Result : " + Solve(arr,size));
        }else System.out.println("Invalid Input");

    }
}
