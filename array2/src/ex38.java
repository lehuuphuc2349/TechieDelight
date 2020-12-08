import java.util.*;

public class ex38 {
    static class Node implements Comparable{
        int value, listnum, index;
        Node(int value, int listnum, int index){
            this.value=value;
            this.listnum=listnum;
            this.index=index;
        }

        public int getValue() {
            return value;
        }

        public int getListnum() {
            return listnum;
        }

        public int getIndex() {
            return index;
        }

        @Override
        public int compareTo(Object o) {
            Node node = (Node) o;
            return value-node.value;
        }
    }
    static class Pair<U,V>{
        private U first;
        private V second;
        Pair(U first, V second){
            this.first=first;
            this.second=second;
        }

        public U getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }
    }
    static Pair Solve(List<List<Integer>> list){
        int high=Integer.MIN_VALUE;
        Pair<Integer, Integer> p = new Pair(0,Integer.MAX_VALUE);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for(int i=0; i<list.size(); i++){
            pq.add(new Node(list.get(i).get(0),i,0));
            high=Integer.max(high,list.get(i).get(0));
        }
        while(true){
            Node top = pq.poll();
            int low=top.getValue();
            int i=top.getListnum();
            int j=top.getIndex();
            if(high-low<p.getSecond()-p.getFirst()){
                p = new Pair(low,high);
            }
            if(j==list.get(i).size()-1){
                return p;
            }
            pq.add(new Node(list.get(i).get(j+1),i,j+1));
            high=Integer.max(high,list.get(i).get(j+1));
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(3, 6, 8, 10, 15),
                Arrays.asList(1, 5, 12),
                Arrays.asList(4, 8, 15, 16),
                Arrays.asList(2, 6)
        );
        Pair<Integer,Integer> pair = Solve(list);
        System.out.println("Minumun Range: (" + pair.getFirst() + "," + pair.getSecond() +")");
    }
}
