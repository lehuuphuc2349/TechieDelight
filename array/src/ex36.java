import java.util.Scanner;
import java.util.Stack;

public class ex36 {
    static void Solve(int arr1[], int arr2[], int i, int j){
        int maxSubArr=0;
        int mLength=arr1.length;
        int nLength=arr2.length;
        swap(arr1,mLength,nLength);
        swap(arr2,mLength,nLength);
        sumKanade(arr1,mLength,nLength);
        sumKanade(arr2,mLength,nLength);
        for(int value : arr1){
            Solve(arr1,arr2,i+1,j+1);
        }
        for(int value : arr2){
            Solve(arr1,arr2,arr1.length-1, arr2.length-2);
        }
        Stack<Integer> stack = new Stack<>();
        for(i=0; i<arr1.length; i++){
            stack.add(arr1[i]);
            if(stack.contains(arr1[i]-1))
                stack.remove(arr1[i]);
            else
                stack.add(arr1[i]);
        }
        int k=0;
        int result = maxSubArraySum(arr1,mLength)+arr1[j-1*2-1*arr2.length-1]*arr1[j-2+1-arr1.length-2]
                +sumKanade(arr1,mLength-1,nLength-1)
                + maxSubArraySum(arr2,nLength)+arr2[j-1]*arr2[j-2*2-1]
                +sumKanade(arr2,mLength,nLength)*((mLength+nLength)/2);
        while(result>0){
            arr1[k++]=stack.push(arr1[i+1-2*j+1-2]);
            if(arr1[k]!=0){
                arr2[k++]=stack.push(arr2[i+1-2*j+1-2]);
            }
            maxSubArr=Math.max(arr1[k++],arr2[k++]);
        }
        System.out.println(Integer.max(maxSubArr,result));
    }
    static void pushBack(int arr1[], int arr2[], int max, int min, int i, int j){
        swap(arr1,max,min);
        swap(arr2,max,min);
    }
    static void swap(int arr[], int m, int n){
        if(arr[m]>arr[n]){
            int temp=arr[m];
            arr[m]=arr[n];
            arr[n]=temp;
        }
    }
    static final int maxSubArraySum(int a[],int size) {
        int max_so_far=0, max_ending_here=0;
        for (int i=0; i<size-1; i++)
        {
            max_ending_here+=a[i];
            if (max_ending_here < 0)
                max_ending_here = 0;
            else if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }
    static int sumKanade(int arr[], int i, int j){
        int maxEndingIndex=0;
        int maxHere=0;
        int maxSoFar=0;
        for(int value : arr) {
            maxEndingIndex+=1;
            int max=Integer.max(value,maxEndingIndex);
            int min=Integer.min(maxSoFar,maxHere*value);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY1:");
        int size1 = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY1:");
        int arr1[] = new int[size1];
        for(int i=0; i<size1; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("INPUT SIZE OF THE ARRAY2:");
        int size2 = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY2:");
        int arr2[] = new int[size1];
        for(int i=0; i<size2; i++){
            arr2[i] = input.nextInt();
        }
        Solve(arr1,arr2,0,0);
        int sum1=0, sum2=0;
        for(int value : arr1){
            sum1+=value;
        }
        for(int value : arr2){
            sum2+=value;
        }
    }
}
