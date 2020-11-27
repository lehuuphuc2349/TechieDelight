import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ex66 {
    static int random(int min, int max){
        if(min>max||(max-min+1>Integer.MAX_VALUE)){
            throw new IllegalArgumentException("Invalid Range");
        }
        return new Random().nextInt(max-min+1)+min;
    }
    static int Solve(int arr[], int probability[], int size){
        if(size!=probability.length){
            return -1;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int probSum[] = new int[size];
        probSum[0]=probability[0];
        for(int i=1; i<size; i++){
            probSum[i]=probSum[i-1]+probability[i];
        }
        int random=random(1,100);
        if(random<probSum[0])
            return arr[0];
        for(int i=1; i<size; i++){
            if(random>probSum[i-1]&&random<=probSum[i])
                return arr[i];
        }
        for(int i=0; i<1000000; i++){
            int value=Solve(arr,probability,size);
            map.put(value,map.getOrDefault(value,0)+1);
        }
        for(int i=0; i<size; i++){
            System.out.println(arr[i]+" ~ " + map.get(arr[i])/10000.0 + "%");
        }
        return -1;
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
        int probability[] = new int[size];
        for(int i=0; i<size; i++){
            probability[i] = in.nextInt();
        }
        if(Solve(arr,probability,size)!=-1){
            Solve(arr,probability,size);
        }
    }
}
