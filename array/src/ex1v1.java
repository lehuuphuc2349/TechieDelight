import java.util.Arrays;
import java.util.Scanner;

public class ex1v1 {
//    USING SORTING
    static void Solve(int arr[], int sum) {
        Arrays.sort(arr);
        int low = 0;
        int hight = arr.length-1;
        while(low < hight) {
            if(arr[low] + arr[hight] == sum) {
                System.out.println("PAIR FOUND");
                return;
            }
            if(arr[low] + arr[hight] < sum)
                low++;
            else
                hight--;
        }
        System.out.println("PAIR NOT FOUND");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] += input.nextInt();
        }
        System.out.println("INPUT GIVEN SUM:");
        int sum = input.nextInt();
        Solve(arr,sum);
    }
}
