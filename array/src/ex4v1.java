import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex4v1 {
    static void Solve(int arr[]){
       int zeros=0;
       for(int value:arr){
           if(value==0)
               zeros++;
       }
       int k=0;
       while(zeros--!=0){
           arr[k++]=0;
       }
       while(k<arr.length){
           arr[k++]=1;
       }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENTS OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i]+=input.nextInt();
        }
        Solve(arr);
        System.out.println(Arrays.toString(arr));
    }
}
