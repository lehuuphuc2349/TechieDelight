import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex37v1 {
    static class Data implements Comparable<Data>{
        int value, count, index;
        Data(int value, int count, int index){
            this.value=value;
            this.count=count;
            this.index=index;
        }
        public int compareTo(Data obj){
            if(this.count!=obj.count){
                return obj.count-this.count;
            }
            return obj.index-this.index;
        }
    }
    static void Solve(int arr[], int size){
        if(arr==null || size<2){
            return;
        }
        Map<Integer,Data> mp = new HashMap<>();
        for(int i=0; i<size; i++){
            Data data = mp.get(arr[i]);
            if(data==null)
                mp.put(arr[i], new Data(arr[i],1,i));
            else
                data.count++;
        }
        Data values[] = mp.values().toArray(new Data[0]);
        Arrays.sort(values);
        int k=0;
//        for(int value : values){
//
//        }
        for(Data data : values) {
            for(int j=0; j<data.count; j++){
                arr[k++]=data.value;
            }
        }
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
        System.out.println("Result is a: " + Arrays.toString(arr));
    }
}
