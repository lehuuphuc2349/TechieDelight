import java.util.*;

public class ex3 {
//    static int count(int arr[], int i){
//        for(int value : arr){
//            if(arr[i]<value){
//
//            }
//        }
//    }
//    static void Solve(int arr[], int size){
//        List<Integer> list = new ArrayList<>();
//        for(int i=0; i<size; i++){
//            int count=0;
//            for(int value : arr){
//                if (arr[i]<value&&i<=size-1){
//                    count++;
//                }
//                list.add(count);
//            }
//
//        }
//        System.out.println("Result: " + list);
//    }
    static void merge(int arr[], int aux[], int low, int mid, int high, Map<Integer,Integer> map){
        int k=low, i=low, j=mid+1;
        int c=0;
        while(i<=mid&&j<=high){
            if(arr[i]>arr[j]){
                map.put(arr[i],map.getOrDefault(arr[i],0)+c);
                aux[k++]=arr[i++];
            }else{
                aux[k++]=arr[j++];
                c++;
            }
        }
        while(i<=mid){
            map.put(arr[i],map.getOrDefault(arr[i],0)+c);
            aux[k++]=arr[i++];
        }
        while(low<=high){
            arr[low]=aux[low];
            low++;
        }

    }
    static void mergeSort(int arr[], int aux[], int low, int high, Map<Integer, Integer>map){
        if(high==low)
            return;
        int mid=(low+((high-low)>>1));
        mergeSort(arr,aux,low,mid,map);
        mergeSort(arr,aux,low+1,high,map);
        merge(arr,aux,low,mid,high,map);
    }
    static Map<Integer, Integer> Solve(int arr[], int size){
        Map<Integer,Integer>map = new HashMap<>();
        int aux[] = Arrays.copyOf(arr,size);
        int array[] = Arrays.copyOf(arr,size);
        mergeSort(array,aux,0,size-1,map);
        return map;
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
        for(int value : arr){
            System.out.print(Solve(arr,size).get(value)+" ");
        }
        System.out.println();
    }
}
