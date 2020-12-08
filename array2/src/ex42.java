import java.util.*;
public class ex42 {
    static int mergeSort(int arr[], int size, int aux[], int low, int mid, int high){
        int k=low, i=low, j=mid+1;
        int count=0;
        while(i<=mid&&j<=high){
            if(arr[i]<=arr[j]){
                aux[k++]=arr[i++];
            }else{
                aux[k++]=arr[j++];
                count+=mid-i+1;
            }
        }
        while(i<=mid){
            aux[k++]=arr[i++];
        }
        for(i=low; i<=high; i++){
            arr[i]=aux[i];
        }
        return count;
    }
    static int Solve(int arr[],int size, int aux[], int low, int high){
        if(low==high) return 0;
        int mid=(low+((high-low)>>1));
        int count=0;
        count+=Solve(arr,size,aux,low,mid);
        count+=Solve(arr,size,aux,mid+1,high);
        count+=mergeSort(arr,size,aux,low,mid,high);
        return count;
    }
    static void insert(int arr[], int size, int aux[], int low, int mid, int high){
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        int aux[] = Arrays.copyOf(arr,size);
//        System.out.println(Arrays.toString(arr));
        System.out.println("Result is a: " + Solve(arr,size,aux,0,size-1));
    }
}
