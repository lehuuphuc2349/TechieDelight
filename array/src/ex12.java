import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex12 {
    static void Sovlve(int arr1[]){
        int swap = 0;
        for(int i=0 ;i< arr1.length-1; i++){
            if(arr1[i]>arr1[i+1]){
                 swap=arr1[i];
                 arr1[i]=arr1[i+1];
                 arr1[i+1]=swap;
            }
        }
    }
    static void Swap(int arr1[],int i, int j){
        int temp=arr1[i];
        arr1[i]=arr1[j];
        arr1[j]=temp;
    }
    static void Suffle(int arr1[]){
        for(int i = arr1.length-1; i>=0; i--){
            Random rand = new Random();
            int j = rand.nextInt(i+1);
            Swap(arr1,i,j);
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
        Suffle(arr1);
        System.out.println("Result: "+ Arrays.toString(arr1));
    }
}
