import java.util.Scanner;

public class ex62 {
    static boolean Solve(int arr[], int size, int sum){
        if(sum==0)
            return true;
        if(sum<0||size<0){
            return false;
        }
        boolean include=Solve(arr,size-1,sum-arr[size]);
        boolean exclude=Solve(arr,size-1,sum);
        return include||exclude;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        int sum = in.nextInt();
        if(Solve(arr,size-1,sum)==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
