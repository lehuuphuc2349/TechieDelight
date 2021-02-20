import java.util.Scanner;

public class ex18v1 {
    static class Pair{
        private static int first;
        private static int second;
        Pair(int first, int second){
            this.first=first;
            this.second=second;
        }
        Pair of(int first, int second){
            return new Pair(first,second);
        }
        @Override
        public String toString() {
            return "[" + first + "," + second + "]";
        }
    }
    static Pair Solve(int arr1[], int size1, int arr2[], int size2, int arr3[], int size3){
        Pair pair = null;
        int diff=Integer.MAX_VALUE;
        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                for(int k=0; k<size3; k++){
                    int low=Math.min(Math.min(arr1[i], arr2[j]),arr3[k]);
                    int high=Math.max(Math.max(arr1[i],arr2[j]),arr3[k]);
                    if(diff>high-low){
                        pair = new Pair(low,high);
                        diff=high-low;
                    }
                }
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array1:");
        int size1 = in.nextInt();
        System.out.println("Enter elements of the array1:");
        int arr1[] = new int[size1];
        for(int i=0; i<size1 ;i++){
            arr1[i] = in.nextInt();
        }
        System.out.println("Enter size of the array2:");
        int size2 = in.nextInt();
        System.out.println("Enter elements of the array2:");
        int arr2[] = new int[size2];
        for(int i=0; i<size2 ;i++){
            arr2[i] = in.nextInt();
        }
        System.out.println("Enter size of the array3:");
        int size3 = in.nextInt();
        System.out.println("Enter elements of the array3:");
        int arr3[] = new int[size3];
        for(int i=0; i<size3 ;i++){
            arr3[i] = in.nextInt();
        }
        Pair pair = Solve(arr1,size1,arr2,size2,arr3,size3);
        if(pair!=null) System.out.println("Result : " + pair);
        else System.out.println("Invalid Input");
    }
}
