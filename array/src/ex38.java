import java.util.Scanner;

public class ex38 {
    static int Solve(int arr[]){
        int profit=0;
        int j=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                j=i;
            }
            if(arr[i-1]<=arr[i]&&(i+1==arr.length||arr[i]>arr[i+1])){
                profit+=(arr[i]-arr[j]);
                System.out.printf("Buy on day %d and sell on day %d\n",j+1,i+1);
            }
        }
        return profit;
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
        System.out.println("Total profit earned is a: " + Solve(arr));
    }
}
