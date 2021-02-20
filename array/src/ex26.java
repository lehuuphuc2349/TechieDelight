import java.util.Scanner;

public class ex26 {
    static void Solve(int arr[], String out, int i, int n, int k){
//        int size=arr.length;
//        int begin=0;
//        int end=-1;
//        for(int i=0; i<size; i++){
//            for(int j=i+1; j<size; j++){
//                if(arr[i]!=arr[j]){
//                    if(arr[i+1]!=arr[j+1]){
//                        begin=arr[i+1];
//                        end=arr[j-1];
//                    }
//                }
//            }
//        }
        if(k>n){
            return;
        }
        if(k==0){
            System.out.println(out);
            return;
        }
        for(int j=i; j<n; j++){
            Solve(arr, out + " " + (arr[j]), j+1,n,k-1);
        }
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
        System.out.println("INPUT GIVEN LENGTH: ");
        int givenLength=input.nextInt();
        Solve(arr,"",0, arr.length, givenLength);
    }
}
