import java.util.*;

public class ex34 {
    static void Solve(int arr[], int size, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer> list = new ArrayList<>();
        for(int value : arr)
            list.add(value);
        pq.addAll(list);
        while(--k>0){
            pq.poll();
        }
        System.out.println("Result : " + pq.peek());
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
        System.out.println("Enter k :");
        int k = in.nextInt();
        Solve(arr,size,k);

    }
}
