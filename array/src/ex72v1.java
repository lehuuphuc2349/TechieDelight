import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex72v1 {
    static void Solve(int arr1[], int size1, int arr2[], int size2, List<Integer>result){
        String str="";
        int i=0;
        while(i<size1&&i<size2){
            str+=(arr1[i]+arr2[i]);
            i++;
        }
        while(i<size1){
            str+=(arr1[i++]);
        }
        while(i<size2){
            str+=(arr2[i++]);
        }
        char chars[] = str.toCharArray();
        System.out.println(chars);
        for(char value : chars){
            result.add(value-'0');
        }
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
        List<Integer> result = new ArrayList<>();
        Solve(arr1,size1,arr2,size2,result);
        System.out.println(result);
    }
}
