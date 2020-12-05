import java.util.*;

public class ex33 {
    static void Solve(int arr[], int size, int k){
        List<Integer> list = new ArrayList<>();
        for(int value : arr)
            list.add(value);
        PriorityQueue<Integer> pq = new PriorityQueue<>(list);
        while(--k>0){
            pq.poll();
        }
//        while(k-->0){
//            System.out.println(k);
//        }
//        while(--k>0){
//            System.out.println(k);
//        }
        System.out.println("Result: " + pq.peek());
    }
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        pq.add(7);pq.add(4);pq.add(6);
//        pq.poll();pq.add(3);pq.poll();pq.add(1);
//        System.out.println(pq);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter k :");
        int k = in.nextInt();
        Solve(arr,size, k);
    }
}
