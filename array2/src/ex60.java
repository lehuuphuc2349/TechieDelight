import java.util.Scanner;

public class ex60 {
    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static void Solve(int arr[], int size, int i, String str){
        if(i==size){
            System.out.println(str);
            return;
        }
        int sum=0;
//        1 2 2
        for(int j=i; j<=Integer.min(i+1,size-1); j++){
            sum=(sum*10)+arr[j];
            System.out.println(sum);
            if(sum>0&&sum<=26){
                Solve(arr,size,j+1,str+alphabet.charAt(sum-1));
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
        String str="";
        Solve(arr,size,0,str);
    }
}
