import java.util.Scanner;

public class ex21v1 {
    static void Solve(int arr[]){
        int n=arr.length;
        int endIndex=0, maxLen=0;
        int i=0;
        while(i+1<n){
            int len=1;
            while(i+1<n&&arr[i]<arr[i+1]){
                i++;
                len++;
            }
            while(i+1<n&&arr[i]>arr[i+1]){
                i++;
                len++;
            }
            if(len>maxLen){
                maxLen=len;
                endIndex=i;
            }
        }
        System.out.println("The Longest SubArray is a: " + maxLen);
        System.out.println("Result : [" + (endIndex-maxLen+1) + "..." + endIndex + "]");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:`");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        Solve(arr);
    }
}
