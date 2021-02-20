import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ex70 {
    static boolean Solve(int arr[], int size){
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toCollection(TreeSet::new));
        if(set.size()!=size){
//            System.out.println("Invalid Input");
            return false;
        }
        int prev=Integer.MAX_VALUE;
        for(int curr :set){
//            if(prev!=Integer.MAX_VALUE&&curr!=arr[prev+1]){
//               return false;
//            }
            if(prev!=Integer.MAX_VALUE&&curr!=prev+1){
                return false;
            }
            prev=curr;
        }
        System.out.println(set);
        return true;
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
        if(Solve(arr,size)==true){
            System.out.println("Consecutive IS Exists");
        }
        else System.out.println("Consecutive Don't Exists");
    }
}
