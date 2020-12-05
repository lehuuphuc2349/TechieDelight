import java.util.Arrays;
import java.util.Scanner;

public class ex29 {
    static int Solve(int arr[], int size){
        int curr=0, count=0;
        Arrays.sort(arr);
//        nlogn;
        int i=0;
        while(i<size){
            curr=arr[i];
            while(i<size&&arr[i]==curr){
                count++;
                i++;
            }
            if(count%2==1)
                return curr;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the arraY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        if(Solve(arr,size)!=-1)
            System.out.println("Result is a: " + Solve(arr,size));
    }
}
