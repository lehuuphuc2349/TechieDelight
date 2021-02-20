import java.util.*;
public class ex18 {
    static void Solve(int arr[]){
        int k=0;
        for(int value: arr){
            if(value!=0){
                arr[k++]=value;
            }
        }
        for(int i=k; i<arr.length; i++){
            arr[k++]=0;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size=in.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=in.nextInt();
        }
        Solve(arr);
        System.out.println("Result: " + Arrays.toString(arr));
    }
}