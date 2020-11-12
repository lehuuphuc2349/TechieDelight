import java.util.Arrays;
import java.util.Scanner;

public class ex21v2 {
    static void Solve(int arr[]){
        int n=arr.length;
        if(n==1){
            System.out.println(Arrays.toString(arr));
        }
        int Incre[] = new int[n];
        int Decre[] = new int[n];
        Incre[0]=1;
        Decre[n-1]=1;
        for(int i=1; i<n; i++){
            Incre[i]=1;
            if(arr[i]>arr[i-1]){
                Incre[i]=Incre[i-1]+1;
            }
        }
        for(int i=n-2; i>=0; i--){
            Decre[i]=1;
            if(arr[i]>arr[i+1]){
                Decre[i]=Decre[i+1]+1;
            }
        }
        int begin=0, end=0;
        int maxLength=0;
        for(int i=0; i<n; i++){
            int length=Incre[i]+Decre[i]-1;
            if(maxLength<length){
                maxLength=length;
                begin=i-Incre[i]+1;
                end=i+Decre[i]-1;
            }
        }
        System.out.println("The Length of the Longest Bitonic SubArray is a: " + maxLength);
        System.out.println("Result : [" + begin + "..." + end + "]");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size=in.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=in.nextInt();
        }
        Solve(arr);
    }
}
