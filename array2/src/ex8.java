import java.util.Arrays;
import java.util.Scanner;

public class ex8 {
    public static class Tuple<X,Y,Z>{
        final X first;
        final Y second;
        final Z third;
        private Tuple(X first, Y second, Z third){
            this.first=first;
            this.second=second;
            this.third=third;
        }
        public static <X,Y,Z> Tuple<X,Y,Z> of(X a, Y b, Z c){
            return new Tuple<>(a,b,c);
        }
    }
    static Tuple Solve(int arr[], int size){
//        int k=0;
//        for(int i=0; i<size-1; i++){
//            for(int j=i+1; j<size; j++){
//                if(arr[i]<arr[j]&&arr[j]<arr[k]){
//                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
//                    if(k<size) k++;
//                }
//            }
//        }
        if(size<3) return null;
        int min[]=new int[size];
        Arrays.fill(min,-1);
        int minIndexSoFar=0;
        for(int i=1; i<size; i++){
            if(arr[i]<arr[minIndexSoFar]){
                minIndexSoFar=i;
            }else{
                min[i]=minIndexSoFar;
            }
        }
        int max[]=new int[size];
        Arrays.fill(max,-1);
        int maxIndexSoFar=size-1;
        for(int i=size-2; i>=0; i--){
            if(arr[i]>arr[maxIndexSoFar]) {
                maxIndexSoFar = i;
            }else{
                max[i]=maxIndexSoFar;
            }
        }
        for(int i=0; i<size; i++){
            if(min[i]!=-1&&max[i]!=-1){
                return new Tuple(min[i],i,max[i]);
            }
        }
        return null;
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
        Tuple<Integer, Integer, Integer>triplet = Solve(arr,size);
        if(triplet!=null)
            System.out.println("Triplet found: " + arr[triplet.first]+" " +arr[triplet.second]+" "+arr[triplet.third]);
        else System.out.println("Triplet Not Found");
    }
}
