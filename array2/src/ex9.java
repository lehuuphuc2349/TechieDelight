import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex9 {
    static void Solve(int arr1[], int size1, int arr2[], int size2){
//        int temp[]=new int[size1+size2];
//        Set<Integer> set = new HashSet<>();
//        for(int value : arr1)
//            set.add(value);
//        for(int value : arr2){
//            set.add(value);
//        }
//        System.out.println(set);
        int result[] = new int[size1];
        for(int i=0; i<size1; i++){
//            1 2 3 4 5
//            3 2 4 1 0
//         => 5 4 2 1 3
            result[arr2[i]]=arr1[i];
        }
        for(int i=0; i<size1; i++){
            arr1[i]=result[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array1:");
        int size1 = in.nextInt();
        System.out.println("Enter elements of the array1:");
        int arr1[] = new int[size1];
        for(int i=0; i<size1; i++){
            arr1[i] = in.nextInt();
        }
        System.out.println("Enter size of the array2:");
        int size2 = in.nextInt();
        System.out.println("Enter elements of the array2:");
        int arr2[] = new int[size2];
        for(int i=0; i<size2; i++){
            arr2[i] = in.nextInt();
        }
        Solve(arr1,size1,arr2,size2);
    }
}
