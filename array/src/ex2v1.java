import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2v1 {
//    USING LIST
    static boolean Solve(int arr[]) {
        List<Integer> list = new ArrayList<>();
        int sum=0;
        list.add(0);
        for(int value : arr) {
            sum+=value;
            if(list.contains(sum))
                return true;
            list.add(sum);
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
            System.out.println("SUBARRAY IS EXISTS");
        else
            System.out.println("SUBARRAY DO NOT EXISTS");
    }
}
