import java.util.Scanner;

public class ex29 {
    static void Solve(int arr[], int k){
        int left=0, count=0, window=0;
        int leftIndex=0;
        for(int right=0; right<arr.length; right++){
//            1 0 1 0 1 1 1 0
            if(arr[right]==0){
                count++;
            }
            while(count>k){
                if(arr[left]==0){
                    count--;
                }
                left++;
            }
            if(right-left+1>window){
                window=right-left+1;
                leftIndex=left;
            }
        }
        System.out.println("The longest sequence has length: "
                + window + " from index " + leftIndex + " to " + (leftIndex+window-1));
    }
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("INPUT NUMBERS OF THE ZEROS:");
        int k = input.nextInt();
        Solve(arr,k);
    }
}
