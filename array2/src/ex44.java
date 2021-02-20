import java.util.Scanner;

public class ex44 {
    static void Solve(int arr[], int size){
//        8 9 10 2 5 6
        int rotatedNumber=0;
        for(int i=0; i<=size-1; i++){
            if(i==size-1) break;
            if(arr[i]>arr[i+1])
                rotatedNumber=i+1;
        }
        System.out.println("Result is a: " + rotatedNumber);
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
