import java.util.Scanner;

public class ex52 {
    static void Solve(int arr[], int size){
        int count=0;
        for(int value : arr){
            if(value==1)
                count++;
        }
        System.out.println(count);
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
