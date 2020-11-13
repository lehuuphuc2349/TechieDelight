import java.util.Scanner;

public class ex33 {
    static int Solve(int arr[], int sumGiven){
        int sum=0;
        int high=0;
        int min=Integer.MAX_VALUE;
//        for(int low=0; low<arr.length; low++){
//            sum+=arr[low];
//            while(sum>sumGiven&&high<arr.length){
//                high++;
//                int len = Integer.min(max,low-high+1);
//            }
//            if(sum>sumGiven&&(low-high+1 == min)){
//                    System.out.printf("Sub-Array found at [%d,%d]\n",arr[low],arr[high-1]);
//                    return;
//            }
//            sum-=arr[low];
        for(int low=0; low<arr.length; low++){
            sum+=arr[low];
            while(sum>sumGiven&&high<=arr.length){
                min=Integer.min(min,low-high+1);
                sum-=arr[high];
                high++;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("INPUT SUM GIVEN");
        int sumGiven = input.nextInt();
        if(Solve(arr,sumGiven)!=Integer.MAX_VALUE){
            System.out.println("Result: " + Solve(arr,sumGiven));
        }else{
            System.out.println("No Sub-Array Exists");
        }
    }
}
