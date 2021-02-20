import java.util.Arrays;
import java.util.Scanner;

public class ex61 {
    static void Solve(int arr[], int size){
        int sum=0;
        int count=0;
        for(int value : arr){
            sum+=value;
        }
//        System.out.println(sum);
        if(sum==0){
            System.out.println(count+ " subarray sum equal {} ," + Arrays.toString(arr));
            return;
        }
        else {
            int left[] = new int[size];
            int right[] = new int[size];
            int sumLeft = 0, sumRight = 0;
//        6 -4 -3 2 3
            for (int i = 0; i<size; i++) {
                sumLeft += arr[i];
                for (int j = size - 1; j > 0; j--) {
                    sumRight += arr[j];
                    if (sumLeft == sumRight) {
                        count += 2;
                    }
                }
            }
        System.out.println("Number Subaarray Equal: " + count);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elemnts of tthe array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
//        System.out.println("Result: " + Solve(arr,size));
        Solve(arr,size);
    }
}
