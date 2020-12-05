import java.util.*;

public class ex32v1 {
    static void Solve(int arr[] ,int size, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer>list = new ArrayList<>();
        for(int value : arr){
            list.add(value);
        }
        queue.addAll(list.subList(0,k));
        for(int i=k; i<list.size(); i++){
            if(list.get(i)<queue.peek()){
                queue.poll();
                queue.add(list.get(i));
            }
        }
        System.out.println(queue);
        System.out.println("Result : " + queue.peek());
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
