import java.util.Random;
import java.util.Scanner;

public class ex50v1 {
    static int rand(int min, int max){
        if(min>max||(max-min+1>Integer.MAX_VALUE)){
            throw new IllegalArgumentException("Invalid Range");
        }
        return new Random().nextInt(max-min+1)+min;
    }
    static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int arr[], int left, int right, int pivotIndex){
        int pivot=arr[pivotIndex];
        swap(arr,pivotIndex,right);
        int pIndex=left;
        for(int i=left; i<right; i++){
            if(arr[i]<=pivot){
                swap(arr,i,pIndex);
                pIndex++;
            }
        }
        swap(arr,pIndex,right);
        return pIndex;
    }
    static int Solve(int arr[], int left, int right, int k){
        if(left==right)
            return arr[left];
       int pivotIndex=rand(left,right);
       pivotIndex=partition(arr,left,right,pivotIndex);
       if(k==pivotIndex)
           return arr[k];
       else if(k<pivotIndex)
           return Solve(arr,left,pivotIndex-1,k);
       else
           return Solve(arr,pivotIndex+1,right,k);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter k'th elements: ");
        int k = in.nextInt();
        System.out.println("k'th smallest element is " + Solve(arr,0,size-1,k));
    }
}
