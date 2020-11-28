import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex72 {
    static void splitnumber(int num, List<Integer>result){
        if(num>0){
            splitnumber(num/10,result);
            result.add(num%10);
        }
    }
    static void Solve(int arr1[], int size1, int arr2[], int size2, List<Integer>result){
        int i=0;
        while(i<size1&&i<size2){
            int sum=arr1[i]+arr2[i];
            splitnumber(sum,result);
            i++;
        }
//        23 5 2 7 87 - 4 67 2 8
        while(i<size1){
            splitnumber(arr1[i++],result);
        }
        while(i<size2){
            splitnumber(arr2[i++],result);
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
