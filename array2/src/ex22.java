import java.util.Scanner;

public class ex22 {
    static void Solve(int arr[], int size){
        int minMoves=0;
        while(true){
            int noOfZeros=0;
            for(int i=0; i<size; i++){
                if(arr[i]%2==1){
                    --arr[i];
                    ++minMoves;
                }
                if(arr[i]==0){
                    noOfZeros++;
                }
            }
            if(noOfZeros==size){
                break;
            }
            for(int j=0; j<size; j++){
                arr[j]=arr[j]/2;
            }
            minMoves++;
        }
        System.out.println("Result is a: " + minMoves);
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
