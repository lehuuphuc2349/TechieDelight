import java.util.Scanner;

public class ex16 {
    static int Solve(int arr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>arr.length/2)
                    return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = in.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=in.nextInt();
        }
        int result = Solve(arr);
        System.out.println("Result : " + result);
    }
}
