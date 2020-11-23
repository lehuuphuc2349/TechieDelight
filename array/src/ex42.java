import java.util.Arrays;
import java.util.Scanner;

public class ex42 {
    static void Solve(int arr[]){
        int n=(int)(Math.sqrt(8*arr.length+1)+1)/2;
        int result[]=new int[n];
        if(n==1)
            result[0]=arr[0];
        else if(n==2)
            result[0]=arr[0]-arr[1];
        else
            result[0]=(arr[0]+arr[1]-arr[n-1])/2;
        for(int i=1; i<n; i++){
            result[i]=arr[i-1]-result[0];
        }
        System.out.println(Arrays.toString(result));
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
