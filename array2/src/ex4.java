import java.util.Scanner;

public class ex4 {
    static int Solve(int arr[], int size){
        int left=0, count=0, maxCount=0, maxIndex=-1, prevIndexZero=-1;
        for(int i=0; i<size; i++){
            if(arr[i]==0){
                prevIndexZero=i;
                count++;
            }
            if(count==2){
                while(arr[left]!=0){
                    left++;
                }
                left++;
                count=1;
            }
//            if(i-left+1<maxCount){
//                maxCount=i-1l
//            }
//            0 0 1 0 1 1 1 0 1 1
            if(i-left+1>maxCount){
                maxCount=i-left+1;
                maxIndex=prevIndexZero;
            }
        }
        return maxIndex;
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
        if(Solve(arr,size)!=-1)
            System.out.println("Result: " + Solve(arr,size));
        else System.out.println("Invalid Input");
    }
}
