import java.util.Arrays;
import java.util.Scanner;

public class ex21 {
    static void Solve(int arr[]){
//        Stores the length of the longest incre SubString
        int Incre[]=new int[arr.length];
        Incre[0]=1;
        for(int i=1; i<arr.length; i++){
            Incre[i]=1;
            if(arr[i-1] < arr[i]){
                Incre[i]=Incre[i-1]+1;
            }
        }
//        Stores the length of the longest decre Substring
        int Decre[]=new int[arr.length];
        Decre[arr.length-1]=1;
        for(int i=arr.length-2; i>=0; i--){
            Decre[i]=1;
            if(arr[i]>arr[i+1]){
                Decre[i]=Decre[i+1]+1;
            }
        }
        int lbsLength=1;
        int beg=0, end=0;
        for(int i=0; i<arr.length; i++){
            int len=Incre[i]+Decre[i]-1;
            if(lbsLength<len){
                lbsLength=len;
                beg=i-Incre[i]+1;
                end=i+Decre[i]-1;
            }
        }
        System.out.println("The Longest SubString Of Bitonic is a: " + lbsLength);
        System.out.println(Arrays.toString(Incre));
        System.out.println(Arrays.toString(Decre));
        System.out.println("Result: [" + beg + "..." + end + "]" );

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size=input.nextInt();
        System.out.println("input Element of the arraY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        Solve(arr);
    }
}
