import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex3 {
    static void Solve(int arr[]) {
//        Map<Integer,Integer> map = new HashMap<>();
//        int sum=0;
            for(int i=0; i<arr.length; i++) {
                int sum=0;
                for(int j=i; j<arr.length; j++) {
                    sum+=arr[j];
                    if(sum==0)
                        System.out.println("SUBARRAY:["+i+"..."+j+"]");
                }
            }

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
        Solve(arr);
    }
}
