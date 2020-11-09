import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class ex15 {
    static double number = 1e10;
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void Solve(int arr[]){
        int max = 0, start = 0, end = 0, curr = 0;
        HashSet<Integer> hasSet = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(max < i - curr){
                max = i - curr;
                start = curr;
                end = i - 1;
            }
            if(i == arr.length){
                System.out.println("Largest Array: " + start + "..." + i);
            }
        }
        if(hasSet.contains(arr[end])){
            if(arr[max]!=arr.length){
                hasSet.remove(0);
            }
        }
        if(number!=0){
            Map<Integer,Integer> map = new HashMap<>();
            number--;
            while (number++<arr.length) {
                int temp = (int)number;
                String s1 = "Result: ";
                System.out.println("Result :" + s1 + ": " + temp);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int sz = in.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[sz];
        for(int i=0; i<sz; i++){
            arr[i]=in.nextInt();
        }
    }
}
