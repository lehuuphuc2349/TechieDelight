import java.util.Arrays;
import java.util.Scanner;

public class ex64 {
    static boolean subsetSum(int arr[], int size, int a, int b, int c){
        if(a==0&&b==0&&c==0){
            return true;
        }
        if(size<0){
            return false;
        }
        boolean A = false;
        if(a-arr[size]>=0){
            A=subsetSum(arr,size-1,a-arr[size],b,c);
        }
        boolean B = false;
        if(!A&&b-arr[size]>=0){
            B=subsetSum(arr,size-1,a,b-arr[size],c);
        }
        boolean C = false;
        if((!B&&!A)&&c-arr[size]>=0){
            C=subsetSum(arr,size-1,a,b,c-arr[size]);
        }
        return A||B||C;
    }
    static boolean Solve(int arr[], int size){
        if(size<3){
            return false;
        }
        int sum=Arrays.stream(arr).sum();
        return (sum%3)==0&&subsetSum(arr,size-1,sum/3,sum/3,sum/3);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        if(Solve(arr,size)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
