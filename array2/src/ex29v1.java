import java.util.Scanner;

public class ex29v1 {
    static int Solve(int arr[], int size) {
        int xor=0;
        for(int value : arr){
            xor^=value;
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the arraY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Result is a: " + Solve(arr,size));
    }
}
