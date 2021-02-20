import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex2 {
//    USING HASHSET
    static boolean Solve(int arr[]) {
        Set<Integer> set = new HashSet<>();
        set.add(0);
        int sum=0;
        for(int value: arr) {
            sum+=value;
            if(set.contains(sum))
                return true;
            set.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENTS OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i]+=input.nextInt();
        }
        if(Solve(arr))
            System.out.println("Sub Array Exists");
        else
            System.out.println("Sub Array Do Not Exists");

    }
}
