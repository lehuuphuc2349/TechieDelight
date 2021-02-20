import java.util.Scanner;

public class ex27 {
    static void Solve(int arr[], int size){
//        if(size<0) return;
//        int max=0;
//        int min=0;
//        for(int i=0; i<size; i++){
//           max=Integer.max(arr[i],arr[i+1]);
//           min=Integer.min(arr[i],arr[i+1]);
////           1 0 1 01 10 1 01 01 10 10
//        }
        int max=arr[0], min=arr[0];
        for(int value : arr){
            if(max<value){
                max=value;
            }
        }
        for(int value : arr){
            if(min>value){
               min=value;
            }
        }
        System.out.println("Result is a: " + min + "," + max);
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
