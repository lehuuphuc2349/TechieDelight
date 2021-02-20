import java.util.Scanner;

public class ex2 {
    static void Solve(int arr[], String out, int i, int size, int sum){
        if(size==0){
            System.out.println(arr);
        }
        if(sum==0){
            System.out.println(out);
        }
        for(int j=i; j<size; j++){
            Solve(arr,out+" "+(arr[j]),j+1,size,sum-arr[j]);
            while(j<size-1&&arr[j]==arr[j+1]){
                break;
            }
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
        System.out.println("Enter sum:");
        int sum = in.nextInt();
        Solve(arr,"",0,size,sum);
    }
}
