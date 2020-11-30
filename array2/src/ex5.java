import java.util.Scanner;
import java.util.stream.IntStream;

public class ex5 {
    static void Solve(int arr[], int size){
//        int sumLeft=0, sumRight=0;
//        int sumAll=0;
//        int mid=(size-1)/2;
//        for(int value : arr){
//            sumAll+=value;
//        }
//        for(int i=0; i<mid; i++){
//            sumLeft+=arr[i];
//        }
//        for(int i=size-1; i>=mid; i--){
//            sumRight+=arr[i];
//        }
//        for(int i=0; i<size; i++){
//            if(arr[i]==sumAll-sumLeft-sumRight)
//                System.out.println("Index is: " + i);
//        }
        int total = IntStream.of(arr).sum();
        System.out.println(total);
        int leftSum=arr[0];
        for(int i=1; i<size-1; i++){
            if(leftSum==total-(arr[i]+leftSum)){
                System.out.println("Index is: " + i);
            }
            leftSum+=arr[i];
        }
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
