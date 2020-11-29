import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex3 {
//    static int count(int arr[], int i){
//        for(int value : arr){
//            if(arr[i]<value){
//
//            }
//        }
//    }
    static void Solve(int arr[], int size){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<size; i++){
            int count=0;
            for(int value : arr){
                while(arr[i]<value){
                    count++;
                }
                list.add(count);
                break;
            }

        }
        System.out.println(list);
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
