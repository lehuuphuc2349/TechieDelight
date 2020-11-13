import java.util.Scanner;

public class ex28v1 {
    static void Solve(int arr[]){
        int maxProduct=0;
        int begin=0, end=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(maxProduct<arr[i]*arr[j]){
                    maxProduct=arr[i]*arr[j];
                    begin=arr[i];
                    end=arr[j];
                }
            }
        }
        System.out.println("Pair:("+begin+","+end+")");
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
