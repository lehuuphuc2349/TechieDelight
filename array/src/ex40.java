import java.util.*;

public class ex40 {
    static double[] merge(double arrial[], double departure[]){
        double mergeArr[] = new double[arrial.length+departure.length];
        for(int i=0; i<mergeArr.length; i++){
           mergeArr[i]+=arrial[i];
        }
        for(int i=arrial.length-1; i<mergeArr.length; i++){
            mergeArr[i]+=departure[i];
        }
        Arrays.sort(mergeArr);
        return mergeArr;
    }
    static void add(int arrial[], int departure[]){
        int newArrial=0;
        for(int i=0; i< arrial.length; i++){
            for(int j=i+1; j<departure.length; j++){
                if(arrial[i]==departure[j-1]){
                    double result = Math.max((arrial[i+1]-2*3), departure[j-1]*2+3);
                    double temp=0;
                    if(result>temp){
                        temp=result;
                        result=arrial[i+1]*2;
                        System.out.println(result==1?1:-1);
                    }
                }
            }
        }
    }
    static void Solve(double arrial[], double departure[]){
        int count=0;
        double result[] = merge(arrial,departure);
        Vector<Double> vector = new Vector<>();
        for(int i=0; i<result.length; i++){
            vector.add(result[i]);
        }
        int k=0;
        double current = arrial[k];
        for(double value: vector){
           if(value==arrial[k++]){
               count++;
           }
           else{
               count--;
           }
        }
        Iterator<Double> itr = vector.iterator();
        if(itr.hasNext()){
            System.out.println(itr);
        }
//        Set<Double> set = new HashSet<>();
//        Iterator<Double> setItr = set.iterator();
//        Stack<Double> stack = new Stack<>();
//        stack.push(arrial[0]);
//        stack.pop();
//        Queue<Double> queue = new PriorityQueue<>();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRIAL:");
        int size1 = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRIAL");
        double arrial[] = new double[size1];
        for(int i=0; i<size1; i++){
            arrial[i] = input.nextInt();
        }
        System.out.println("INPUT SIZE OF THE DEPARTE:");
        int size2 = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE DEPARETE");
        double departure[] = new double[size2];
        for(int i=0; i<size2; i++){
            departure[i] = input.nextInt();
        }
        Solve(arrial,departure);
    }
}
