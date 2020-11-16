import java.util.Scanner;

public class ex35 {
    static void Solve(int arr[]){
        int size = arr.length;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[j]<arr[i]){
                    System.out.println("Sorting Begin " + i + " to " + (size-1));
                    return;
                }
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
            arr[i] = input.nextInt();
        }
        Solve(arr);
    }
}
