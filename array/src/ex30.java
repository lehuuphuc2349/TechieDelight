import java.util.Scanner;

public class ex30 {
    static void Solve(int arr[], int k){
       int sum=0;
       int min=Integer.MAX_VALUE;
       int last=0;
       for(int i=0; i<arr.length; i++){
           sum+=arr[i];
           if(i+1>=k){
               if(min>sum){
                   min=sum;
                   last=i;
               }
               sum-=arr[i+1-k];
           }
       }
        System.out.printf("Minimun subarray is (%d,%d)\n", last-k+1, last);
        System.out.println(sum);
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
        System.out.println("INPUT LENGTH OF THE SUBARRAY:");
        int k = input.nextInt();
        Solve(arr,k);
    }
}
