import java.util.Scanner;

public class ex48v1 {
    static boolean Solve(int arr[], int size, int sum, int count){
        for(int i=0; i<size-1; i++){
           int result=arr[i];
           for(int j=i+1; j<size&&count<4; j++){
               result+=arr[j];
               count++;
               if(result==sum){
                   return true;
               }
           }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter given sum:");
        int sum = in.nextInt();
        System.out.println(Solve(arr,size,sum,0)?"Quadruplet Exists":"Quadruplet Don't Exists");
    }
}
