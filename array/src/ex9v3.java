import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex9v3 {
    static void Solve(int arr1[],int arr2[]){
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;

                Arrays.sort(arr2);
            }
        }
//        for(int i=0; i<arr2.length-1; i++){
//            if(arr2[i]>arr2[i+1]){
//                int temp =arr2[i];
//                arr2[i]=arr2[i+1];
//                arr2[i+1]=temp;
//            }
//        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY1:");
        int size1 = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY1:");
        int arr1[] = new int[size1];
        for(int i=0;i<size1;i++){
            arr1[i]=input.nextInt();
        }
        System.out.println("INPUT SIZE OF THE ARRAY2:");
        int size2 = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY2:");
        int arr2[] = new int[size2];
        for(int i=0;i<size2;i++){
            arr2[i]=input.nextInt();
        }
        Solve(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
