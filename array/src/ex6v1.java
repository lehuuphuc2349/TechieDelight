import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex6v1 {
    static void Solve(int arr[],int sum){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int len=0;
        int end=-1;
        for(int i=0; i<arr.length; i++){
            int sumTemp=0;
            sumTemp+=arr[i];
            map.putIfAbsent(sumTemp,i);
//            if(map.containsKey(sumTemp-sum)&&len<i-map.get(sumTemp-sum)){
//                len=i-map.get(sumTemp-sum);
//                end=i;
//            }
            if(map.containsKey(sumTemp-sum) && len < i - map.get(sumTemp-sum)){
                len = i - map.get(sumTemp-sum);
                end = i;
            }
        }
        for(int i=(end-len+1); i<=end; i++){
            System.out.print(arr[i]+" ");
        }
//        System.out.println((end-len+1)+","+end);
        System.out.println();
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
        System.out.println("INPUT TARGET SUM:");
        int sum = input.nextInt();
        Solve(arr,sum);
    }
}
