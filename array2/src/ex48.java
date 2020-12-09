import java.util.Scanner;

public class ex48 {
    static void Solve(int arr[], int size){
        int result=0;
        int k=0,l=1;
        int sum=0, sumAbstract=0;
        for(int value : arr){
            sum+=value;
        }
        for(int i=0; i<=arr[size-1]; i++){
            sumAbstract+=i;
        }
        if(arr[0]!=0)
            result=0;
        else if(sumAbstract-sum==0)
            result=arr[size-1]+1;
        else {
            while(k<size&&l<size){
                if(arr[l]-arr[k]>1){
                    result=arr[k]+1;
                    break;
                }
                k++;l++;
            }
        }
        System.out.println("Result is a: " + result);
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
        Solve(arr,size);
    }
}
