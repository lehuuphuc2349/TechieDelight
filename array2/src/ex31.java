import java.util.Scanner;

public class ex31 {
    static boolean Solve(int arr[], int size, int index){
        if(2*index+2>size) return true;
        boolean left=(arr[index]<=arr[2*index+1])&&Solve(arr,size,2*index+1);
        boolean right=(2*index+2==size)||(arr[index]<=arr[2*index+2]&&Solve(arr,size,2*index+2));
        return left&&right;
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
        if(Solve(arr,size,0))
            System.out.println("Given array is a min heap");
        else
            System.out.println("Given array is not a min heap");
    }
}
