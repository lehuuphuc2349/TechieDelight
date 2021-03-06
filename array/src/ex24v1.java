import java.util.Arrays;
import java.util.Scanner;

public class ex24v1 {
    static int Solve(int arr[]){
        int maxNumber=Arrays.stream(arr).max().getAsInt();
        if(maxNumber<0){
            return maxNumber;
        }
        int maxSoFar=0;
        int maxEndingHere=0;
        for(int value: arr){
            maxEndingHere=maxEndingHere+1;
            maxEndingHere=Integer.max(maxEndingHere,0);
            maxSoFar=Integer.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        Solve(arr);
    }
}
