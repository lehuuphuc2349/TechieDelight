import java.util.Scanner;

public class ex21 {
    static void Solve(int arr[]){
        int Incre[]=new int[arr.length];
        Incre[0]=1;
        for(int i=1; i<arr.length; i++){
            Incre[i]=1;
            if(arr[i-1] < arr[i]){
                Incre[i]=Incre[i-1]+1;
            }
        }
        int Decre[]=new int[arr.length];
        Decre[arr.length-1]=1;
        for(int i=0; i<arr.length; i++){
            
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size=input.nextInt();
        System.out.println("input Element of the arraY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
    }
}
