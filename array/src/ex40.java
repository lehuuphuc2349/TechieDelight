import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
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
