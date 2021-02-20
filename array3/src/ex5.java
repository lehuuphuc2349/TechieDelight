import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex5 {
    static int findIndex(int arr[], int size, int key){
        Map<Integer, Integer> mp = new HashMap<>();
        int index=-1;
        for(int i=0; i<size; i++){
            if(mp.containsKey(key)){
                index=mp.get(key);
            }else{
                mp.put(arr[i],i);
            }
        }
        return index;
    }
    static int binarySearch(int arr[], int size, int low, int high, int key){
       if(low<high){
           return -1;
       }
//       while(low<high){
//            if(low==mid){
//                return mid;
//            }
//       }
//        if(low==high){
//           return low;
//        }
        int mid=(high+low)>>1;
       if(key==arr[mid]){
           return mid;
       }
       if(key>arr[mid])
           return binarySearch(arr,size,(mid+1),high,key);
       return binarySearch(arr,size,low,(mid-1),key);
    }
    static void rotate(int arr[], int size, int d){
        for(int i=0; i<d; i++){
            leftRotateByOne(arr,size,d);
        }
    }
    static void leftRotateByOne(int arr[], int size, int d){
        int temp, i;
        temp=arr[0];
        for(i=0; i<size-1; i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
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
        System.out.println("Enter d:");
        int d = in.nextInt();
        System.out.println("Enter key:");
        int key = in.nextInt();
        System.out.println("Before: " +Arrays.toString(arr));
        System.out.println("Key: " + findIndex(arr,size,key));
        rotate(arr,size,d);
        System.out.println("After: " + Arrays.toString(arr));
        System.out.println("Key: " + findIndex(arr,size,key));
//        System.out.println("Key temp: " + binarySearch(arr,size,0,size-1,key));
    }
}
