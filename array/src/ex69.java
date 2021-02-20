import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex69 {
    static void Solve(int arr[], int size){
        if(size<0){
            System.out.println("Invalid Input");
        }
//        1 1 1 1 1 - 1 2 3 4 5 - 1 3 6 10 15 - 1 4 10 20 35
        /*
        * 1 1 1 1 1
        * 1 2 3 4 5
        * 1 3 6 10 15
        * 1 4 10 15 35
        * 1 5 15 30 70
        * */
//        Arrays.sort(arr);
//        int min=0, max=0;
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
//        for(int value : arr){
//           if(min<value) min=value;
//           if(max>value) max=value;
//        }
        for(int value : arr){
            if(value < min) min=value;
            if(value > max) max=value;
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<size; i++){
            if(set.contains(arr[i])){
                System.out.println("Array Do Not Consecutive As Elements : " + arr[i] + " is repeating");
            }
            else set.add(arr[i]);
        }
//        if(arr[size-1]-arr[0]==size-1){
//            System.out.println("Array contains Consecutive at: "+arr[0]+","+arr[size-1]);
//        }
        if(max-min==size-1)
            System.out.println("Array contains Consecutive at: " + min+ "," + max);


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
