import java.util.Arrays;
import java.util.Scanner;

public class ex73v1 {
    static void Solve(int arr[], int size){
        int min1=arr[0], min2=Integer.MAX_VALUE, min3=Integer.MAX_VALUE;
        for(int value : arr){
            if(value<min1){
                min3=min2;
               min2=min1;
               min1=value;
            }else if(value<min2){
                min3=min2;
                min2=value;
            }else min3=value;
        }
        int max1=arr[0], max2=Integer.MIN_VALUE;
        for(int value : arr){
            if(value>max1){
                max2=max1;
                max1=value;
            }else max2=value;
        }
        int minProduct=Integer.min(min1*min2*min3,max1*max2*min1);
        if(minProduct==min1*min2*min3)
            System.out.println("Result : " + minProduct + " and triplet is a: " + min1+","+min2+","+min3);
        else
            System.out.println("Result : " + minProduct + " and triplet is a: " + max1+","+max2+","+min1);
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
        Solve(arr,size);
    }
}
