import java.util.*;

public class ex7 {
    static int partition(int arr[], int size){
        int j=0;
        int pivot=0;
        for(int i=0; i<size; i++){
            if(arr[i]<pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return j;
    }
    static void Solve(int arr[], int size){
        int p=partition(arr,size);
        for(int n=0; (p<size&&n<p); p++, n+=2){
            int temp=arr[n];
            arr[n]=arr[p];
            arr[p]=temp;
        }

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
        System.out.println(Arrays.toString(arr));
    }
}
