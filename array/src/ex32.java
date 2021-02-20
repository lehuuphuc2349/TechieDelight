import java.util.Scanner;

public class ex32 {
    static void Solve(int arr[], int sum){
        int sumTemp=0;
//        2 6 0 9 7 3 1 4 1 10
//        --> 6 0 9;
        int high=0;
        for(int low=0; low<arr.length; low++){
            while(sumTemp<sum&&high<arr.length){
                sumTemp+=arr[high];
                high++;
            }
//            if(sumTemp==sum)
//                System.out.printf("The Sub-Array found [%d,%d]\n", low, high);
            if(sumTemp==sum){
                System.out.printf("The Sub array found [%d,%d] \n", arr[low],arr[high-1]);
                return;
            }
            sumTemp-=arr[low];
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
        System.out.println("INPUT SUM GIVEN:");
        int sum = input.nextInt();
        Solve(arr,sum);
    }
}
