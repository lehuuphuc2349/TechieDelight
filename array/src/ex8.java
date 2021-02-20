import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex8 {
    static void Solve(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int swap = arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
            }
        }
    }
    static void Solve1(int arr[]){
//        int zeros = 0;
//        int one =0;
//        int two =0;
//
        int tempArr[] = new int[arr.length];
        int zeors=0;
        int one=0;
        int two=0;
        for(int value: arr){
            if(value == 0){
                zeors++;
            } else if(value==1){
                one++;
            }
            else {
                two++;
            }
        }
        for(int i=0; i<(tempArr.length-one-two); i++){
            tempArr[i]+=0;
        }
        for(int i=zeors-1; i<(tempArr.length-zeors-two); i++){
            tempArr[i]+=1;
        }
        for(int i=one-1; i<(tempArr.length-one-zeors); i++){
            tempArr[i]+=2;
        }
        int k = 0;
        while(zeors--!=0){
            tempArr[k++]+=0;
        }
        while(one--!=0){
            tempArr[k++]+=1;
        }
        while(two--!=0){
            tempArr[k++]+=2;
        }
        System.out.println("Array: " + Arrays.toString(tempArr));
        System.out.println(zeors);
        System.out.println(one);
        System.out.println(two);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENTS OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i]+=input.nextInt();
        }
        System.out.println("BEFORE: " + Arrays.toString(arr));
        Solve(arr);
        System.out.println("AFTER:" + Arrays.toString(arr));
        Solve1(arr);
    }
}
