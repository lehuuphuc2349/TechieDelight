import java.util.Arrays;
import java.util.Scanner;

public class ex73 {
    static void Solve(int arr[], int size){
        if(size<=2){
            System.out.println("Invalid Input");
        }
//        Arrays.sort(arr);
        Arrays.sort(arr);
//        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
//        for(int value : arr) {
//            if (value > min) min = value;
//            if (value < max) max = value;
//        }
        System.out.println(Arrays.toString(arr));
        int minProduct=0;
        int n1=0,n2=0,n3=0;
        if(arr[arr.length-1]*arr[arr.length-2]*arr[0]<arr[0]*arr[1]*arr[2]) {
            minProduct = arr[arr.length - 1] * arr[arr.length - 2] * arr[0];
            n1=arr[arr.length-1]; n2=arr[arr.length-2]; n3=arr[0];
        }else{
            minProduct=arr[0]*arr[1]*arr[2];
            n1=arr[0]; n2=arr[1]; n3=arr[2];
        }
        System.out.println(n1+","+n2+","+n3);
        System.out.println("MINPRODUCT IS A : " + minProduct);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
//        int result = Solve(arr,size);
//        System.out.println(result);
        Solve(arr,size);
    }
}
