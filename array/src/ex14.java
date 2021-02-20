import java.util.Scanner;

public class ex14 {
    static int countPrev(int arr[],int i){
        int sum = 0;
        for(int n=0; n<=i; n++){
           sum+=arr[n];
        }
        return sum;
    }
    static int countNext(int arr[],int i){
        int sum = 0;
        for(int n = i; n < arr.length; n++){
            sum+=arr[n];
        }
        return sum;
    }
    static void Solve(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(countNext(arr,i)==countPrev(arr,i))
                System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int sz = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[]=new int[sz];
        for(int i=0; i<sz; i++){
            arr[i]= input.nextInt();
        }
        Solve(arr);
    }
}
