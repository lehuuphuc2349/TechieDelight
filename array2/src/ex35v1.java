import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ex35v1 {
    static class Pair{
        Integer num;
        Character sign;
        Pair(Integer num, Character sign){
            this.num = num;
            this.sign = sign;
        }

        @Override
        public String toString() {
            return this.sign + "," + this.num;
        }
    }
    static void printList(Deque<Pair>q){
        for(Pair p : q){
            System.out.print(p);
        }
        System.out.println();
    }
    static void Solve(int arr[], int size, int sum, int target, Deque<Pair>q){
        if(sum==target){
            printList(q);
            return ;
        }
        if(size<0)
            return;
        Solve(arr,size-1,sum,target,q);
        q.addLast(new Pair(arr[size],'+'));
//        1 5 1 4 2 1 0 2 3 1
        Solve(arr,size-1,sum+arr[size], target,q);
//        1 4 1 2 3 1 0 2 3 1 => 1 1 1 1 2 2 3 3 4 => 0 1 1 1 2 2 3 3 4
        q.pollLast();
        Solve(arr,size-1,sum,target,q);
        q.addLast(new Pair(arr[size],'-'));
        Solve(arr,size-1,sum-arr[size],target,q);
        q.pollLast();

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elemenst of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
            arr[i]=in.nextInt();
        System.out.println("Enter target:");
        int target = in.nextInt();
        Deque<Pair> q = new ArrayDeque<>();
        Solve(arr,size-1,0,target,q);
    }
}
