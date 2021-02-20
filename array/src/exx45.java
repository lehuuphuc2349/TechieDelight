import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exx45 {
    static int Solve(int arr1[],int arr2[]){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sumX=0, sumY=0;
        int result=0;
        for(int i=0; i<arr1.length; i++){
            sumX+=arr1[i];
            sumY+=arr2[i];
            int diff=sumX-sumY;
            if(!map.containsKey(diff))
                map.put(diff,i);
            else
                result=Math.max(result,i-map.get(diff));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY1:");
        int size1 = in.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY1");
        int arr1[] = new int[size1];
        for(int i=0; i<size1; i++){
            arr1[i] = in.nextInt();
        }
        System.out.println("INPUT SIZE OF THE ARRAY2:");
        int size2 = in.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY2");
        int arr2[] = new int[size2];
        for(int i=0; i<size2; i++){
            arr2[i] = in.nextInt();
        }
        System.out.println("Result: " + Solve(arr1,arr2));
    }
}
