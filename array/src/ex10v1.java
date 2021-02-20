import java.util.Arrays;
import java.util.Scanner;

public class ex10v1 {
    static void merge(int arr1[],int arr2[],int m, int n){
        int k = m + n + 1;
        while(m>=0&&n>=0) {
            if (arr1[m] > arr2[n])
                arr1[k--]=arr1[m--];
            else
                arr1[k--]=arr2[n--];
        }
        while(n>=0){
            arr1[k--]=arr2[n--];
        }
        Arrays.fill(arr2,0);
    }
    static void rerrRange(int arr1[],int arr2[]){
       int k=0;
       for(int value:arr1){
           if(value!=0){
               arr1[k++]=value;
           }
       }
       merge(arr1,arr2,k-1,arr2.length-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY1:");
        int sz1 = in.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY1:");
        int arr1[] = new int[sz1];
        for(int i=0; i<sz1; i++){
            arr1[i]=in.nextInt();
        }
        System.out.println("INPUT SIZE OF THE ARRAY2:");
        int sz2 = in.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY2:");
        int arr2[] = new int[sz2];
        for(int i=0; i<sz2; i++){
            arr2[i]=in.nextInt();
        }
        rerrRange(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
    }
}
