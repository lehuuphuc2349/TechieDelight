import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    static void Solve(int arr[],String out,int i, int size, int length){
//        for(int i=0; i<size-1; i++){
//            for(int j=i+1; j<size; j++){
//                System.out.println(arr[i] + " , " + arr[j]);
//            }
//        }
        if(length>size){
            return;
        }
        if(length==0){
            System.out.println(out);
            return;
        }
        for(int j=i; j<size; j++){
            Solve(arr,out + " " + (arr[j]), j+1,size,length-1);
            while(j<size-1&&arr[j]==arr[j+1]){
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the arraY:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter length");
        int length = in.nextInt();
        Solve(arr,"",0,size,length);
    }
}
