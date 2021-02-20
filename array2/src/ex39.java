import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ex39 {
    static class Node implements Comparable{
        private int value, i, index;
        public Node(int value, int index, int i){
            this.value=value;
            this.index=index;
            this.i=i;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
        public int getListNum(){
            return i;
        }

        @Override
        public int compareTo(Object o) {
            Node node = (Node)o;
            return value-node.value;
        }
    }
    static void Solve(List<List<Integer>> list){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).size()>=1)
                pq.add(new Node(list.get(i).get(0),i,0));
        }
        while(!pq.isEmpty()){
            Node min =  pq.poll();
            System.out.println(min.getValue()+ " ");
            if(min.getIndex()+1<list.get(min.getListNum()).size()){
                min.setIndex(min.getIndex()+1);
                min.setValue(list.get(min.getListNum()).get(min.getIndex()));
                pq.add(min);
            }
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(10,20,30,40),
                                    Arrays.asList(15,25,35),Arrays.asList(27,29,37,48,93),
                                    Arrays.asList(32,33));
       Solve(list);
    }
}
