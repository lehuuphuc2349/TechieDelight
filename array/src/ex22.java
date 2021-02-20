import java.util.*;

public class ex22 {
    private static void print(Map<Integer, Integer> map, Integer lastElement){
        while(map.get(lastElement)!=null){
            System.out.println(lastElement);
            lastElement=map.get(lastElement);
        }
        System.out.println(lastElement);
    }
    static void Solve(int arr[]){
        int n=arr.length;
        NavigableSet<Integer> set = new TreeSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            set.add(arr[i]);
            if(arr[i]!=set.last()){
                set.remove(set.ceiling(arr[i]+1));
            }
            if(set.last()==arr[i]){
                map.put(arr[i],set.floor(arr[i]-1));
            }
        }
        print(map,set.last());

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        Solve(arr);
    }
}
