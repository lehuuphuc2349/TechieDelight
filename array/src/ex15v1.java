import java.util.Scanner;

public class ex15v1 {
    static boolean isConsecutive(int arr[], int i, int j, int min, int max){
        if(max-min!=j-i){
            return false;
        }
        boolean visited[]=new boolean[j-i+1];
        for(int k=i; k<=j; k++){
            if(visited[arr[k]-min]){
                return false;
            }
            visited[arr[k]-min]=true;
        }
        return true;
    }
    static void Solve(int arr[]){
        int len=1;
        int start=0, end=0;
        for(int i=0; i<arr.length; i++){
            int min=arr[i], max=arr[i];
            for(int j=i+1; j<arr.length; j++){
               min=Math.min(min,arr[j]);
               max=Math.max(max,arr[j]);
               if(isConsecutive(arr,i,j,min,max)){
                   if(len<max-min+1){
                       len=max-min+1;
                       start=i;
                       end=j;
                   }
               }
            }
        }
        System.out.println("The Largest SubArray is:[" + start + "," + end + "]");
    }
    public static void main(String[] args){
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
