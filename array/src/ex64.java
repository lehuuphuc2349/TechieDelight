import java.util.Arrays;
import java.util.Scanner;

public class ex64 {
    static void Solve(int arr[], int size){
        int m1=1, m2=1;
        Arrays.sort(arr);
        boolean ok=true;
        m1=arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];
        if(arr[0]*arr[1]>arr[1]*arr[2]){
            m2=arr[0]*arr[1]*arr[arr.length-1];
            ok=true;
        }
        else {
            m2=arr[1]*arr[2]*arr[arr.length-1];
            ok=false;
        }
        int result=Integer.max(m1,m2);
        if(result==m1){
            System.out.println(arr[arr.length-1]+","+arr[arr.length-2]+","+arr[arr.length-3]);
        }
        else if(result==m2&&ok){
            System.out.println(arr[0]+","+arr[1]+","+arr[arr.length-1]);
        }
        else if(result==m2&&!ok){
            System.out.println(arr[1]+","+arr[2]+","+arr[arr.length-1]);
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
