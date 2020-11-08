import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex9v1 {
    static void Solve(int arr1[],int arr2[]){
        int length1 = arr1.length;
        int length2 = arr2.length;
        for(int i=0; i<length1; i++){
            if(arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;

                int first = arr2[0];
                int k;
                for(k=1;k<length2&&arr2[k]<first;k++){
                    arr2[k-1]=arr2[k];
                }
                arr2[k-1]=first;
            }

        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY1:");
        int size1 = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY1:");
        int arr1[] = new int[size1];
        for(int i=0; i<size1; i++){
            arr1[i]=input.nextInt();
        }
        System.out.println("INPUT SIZE OF THE ARRAY2");
        int size2 = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARTY:");
        int arr2[] = new int[size2];
        for(int i=0; i<size2; i++){
            arr2[i]=input.nextInt();
        }
        Solve(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
