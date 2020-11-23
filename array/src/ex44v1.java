import java.util.Scanner;

public class ex44v1 {
    static boolean Solve(int arr[], int n, int sum, int count){
       if(count==3&&sum==0){
           return true;
       }
       if(count==3||n==0||sum<0){
           return false;
       }
       return Solve(arr,n-1,sum-arr[n-1],count+1) ||
               Solve(arr,n-1,sum,count);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = in.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("INPUT SUM:");
        int sum = in.nextInt();
        System.out.println(Solve(arr,size,sum,0)?"Triplet Exists":"Triplet Don't Exists");
    }
}
