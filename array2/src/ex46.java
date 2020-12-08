import java.util.Scanner;

public class ex46 {
    static void Solve(int arr[], int size, int number){
        int k=0, first=0, last=size-1;
        while(true){
            if(arr[++k]==number){
                first=k;
                break;
            }
        }
        while(k++<size-1){
            if(arr[k]!=number){
                last=k-1;
                break;
            }
        }
        System.out.println("First occur: " + first+ " , Last occur: " + last);
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
        System.out.println("Enter target number:");
        int number = in.nextInt();
        Solve(arr,size,number);
    }
}
