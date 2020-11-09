import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex13 {
      static void swap(int arr1[],int i, int j){
          int temp = arr1[i];
          arr1[i]=arr1[j];
          arr1[j]=temp;
      }
      static void Solve(int arr1[]){
            if(arr1[1]>arr1[0]&&arr1[1]>arr1[2]){
                System.out.println("Result: " + Arrays.toString(arr1));
            }
            else {
//                int max = Math.max(arr1[0],arr1[2]);
//                if(max == arr1[0]){
//                    swap(arr1[0],arr1[1]);
//                }
//                else
//                swap(arr1[2],arr1[1]);
//                System.out.println("Result: " + Arrays.toString(arr1));
                if(Math.max(arr1[0],arr1[2])==arr1[0]){
//                    int temp = arr1[0];
//                    arr1[0] = arr1[1];
//                    arr1[1] = temp;
                    swap(arr1,0,1);
                }
                else{
//                    int temp = arr1[2];
//                    arr1[2] = arr1[1];
//                    arr1[1] = temp;
                    swap(arr1,2,1);
                }
                System.out.println("Result : " + Arrays.toString(arr1));
            }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int sz = in.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr1[] = new int[sz];
        for(int i=0; i<sz; i++){
            arr1[i]=in.nextInt();
        }
        Solve(arr1);
    }
}
