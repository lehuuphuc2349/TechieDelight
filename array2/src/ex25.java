import java.util.Scanner;

public class ex25 {
    static void Solve(int arr[], int size){
        if(size<0) return;
        int buy=arr[0];
        int sell=0;
        int maxProFit=0;
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(arr[j]>arr[i]){
                    buy=arr[i];
                    sell=Integer.max(arr[j],arr[j+1]);
//                    System.out.println("Buy at price: " + buy + " and sell at " + sell);
                    maxProFit+=(sell-buy);
                    break;
                }
            }
        }
        System.out.println("Result is a: " + maxProFit);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the aray:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        Solve(arr,size);
    }
}
