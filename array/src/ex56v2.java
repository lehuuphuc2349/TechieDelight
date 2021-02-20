import java.util.*;

public class ex56v2 {
    static void Solve(List<Integer>input, int sum, int begin, List<Integer>comb, List<List<Integer>>result){
        if(comb.size()==3){
            result.add(new ArrayList<>(comb));
            return;
        }
        for(int i=begin; i<input.size()&&input.get(i)<=sum; i++){
           comb.add(input.get(i));
           Solve(input,sum-input.get(i),i+1,comb,result);
           comb.remove(comb.size()-1);
        }
    }
    public static void main(String[] args) {
        int sum=10;
        List<Integer>input = Arrays.asList(2,7,4,9,5,1,3);
        Collections.sort(input);
        List<Integer>comb = new ArrayList<>();
        List<List<Integer>>result = new ArrayList<>();
        Solve(input,sum,0,comb,result);
        for(List<Integer>triplet:result){
            System.out.println(triplet.get(0)+","+triplet.get(1)+","+triplet.get(2));
        }
    }
}
