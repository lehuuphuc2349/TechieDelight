import java.util.Scanner;

public class ex41 {
    static int Solve(int arr[], int size) {
        int count=0;
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]>arr[j])
                    count++;
            }
        }
        return count;
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
        System.out.println("Result is a: " + Solve(arr,size));
    }
}
