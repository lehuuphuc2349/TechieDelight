import java.util.Scanner;

public class ex18 {
    static class Pair<U,V>{
        public U first;
        public V second;
        Pair(U first, V second){
            this.first=first;
            this.second=second;
        }

        private static <U,V> Pair<U,V> of(U a, V b){
            return new Pair<>(a,b);
        }

        @Override
        public String toString() {
            return "[" + first + "..." + second + "]";
        }
    }
    static Pair<Integer,Integer> Solve(int arr1[], int size1, int arr2[], int size2, int arr3[], int size3){
        Pair<Integer,Integer> pair = null;
        int diff=Integer.MAX_VALUE;
        int i=0, j=0, k=0;
        while(i<size1&&j<size2&&k<size3){
            int low=Math.min(Math.min(arr1[i],arr2[j]),arr3[k]);
            int high=Math.max(Math.max(arr1[i],arr2[j]),arr3[k]);
            if(diff>high-low){
                pair=Pair.of(low,high);
                diff=high-low;
            }
            if(arr1[i]==low)
                i++;
            if(arr2[j]==low)
                j++;
            if(arr3[k]==low)
                k++;
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
        Pair<Integer, Integer> result = Solve(arr1,size1,arr2,size2,arr3,size3);
        if(result!=null)
            System.out.println("Result is a: " + result);
        else
            System.out.println("Invalid Input");
    }
}
