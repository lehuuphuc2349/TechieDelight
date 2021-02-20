import java.util.Scanner;

public class ex63 {
    static void dfs(int arr[], int size){
        int i=0, j=0, k=0;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
    }
    static boolean solve(int arr[], int size, int sum){
        if(sum==0)
            return true;
        if(size<0||sum<0)
            return false;
        boolean include=solve(arr,size-1,sum-arr[size]);
        if(include)
            return true;
        boolean exclude=solve(arr,size-1,sum);
        return exclude;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        int sum = in.nextInt();
        System.out.println(solve(arr,size-1,sum));
    }
}
