import java.util.Scanner;

public class ex48 {
    static boolean Solve(int arr[], int size, int sum, int count) {
//        int result=0;
//        int count=1;
//        for(int i=0; i<arr.length-1; i++){
//           if(count<=4){
//               result+=arr[i];
//               count++;
//           }
//            if(result==sum){
//                System.out.println("Quadruplet Exists");
//                return;
//            }
//    }
        if(sum==0||count==4){
            return true;
        }
        if(count>4||size==0){
            return false;
        }
        return Solve(arr,size-1,sum-arr[size-1],count+1)||
                Solve(arr,size-1,sum,count);
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
        System.out.println("Enter given sum:");
        int sum = in.nextInt();
        System.out.println(Solve(arr,size,sum,0)?"Quadruplet Exists":"Quadruplet Don't Exists");
    }
}
