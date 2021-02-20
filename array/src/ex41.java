import java.util.Scanner;

public class ex41 {
    static void Solve(int arr[], int size){
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                System.out.println((arr[i]+arr[j]-arr[size-1])/2);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        Solve(arr,size);
    }
}
