import java.util.Scanner;

public class ex31v1 {
    static boolean Solve(int arr[], int size){
        for(int i=0; i<(size/2)-2; i++){
            if(arr[i]>arr[2*i+1]||(2*i+2!=size&&arr[i]>arr[2*i+2]))
                return false;
        }
        return true;
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
        if(Solve(arr,size))
            System.out.println("Given array is a min heap");
        else
            System.out.println("Given array is not a min heap");
    }
}
