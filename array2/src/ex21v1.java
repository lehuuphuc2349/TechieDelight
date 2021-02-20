import java.util.Scanner;

public class ex21v1 {
    static void Solve(int arr[], int size){
        int xor=0;
        for(int value : arr){
            xor=xor^value;
        }
        System.out.println("Result : " + xor);
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
        Solve(arr,size);
    }
}
