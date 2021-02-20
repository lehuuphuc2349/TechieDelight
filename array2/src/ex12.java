import java.util.Scanner;

public class ex12 {
    static void Solve(int arr[], int size){
//        1 2 -2 3 -2 1 -2 -3
            int count=0;
            int curr=0;
            for(int i=0; i<size-1; i++){
                for(int j=i+1; j<size; j++){
//                    1 -2 6 4 -3 2 -4 -3
                    if(arr[j-1]<0&&arr[j]>0){
                        count++;
                        curr=j;
                    }
                    if(arr[j-1]<0&&arr[j]<0){
                        count=0;
                        break;
                    }
                    if(arr[j-1]>0&&arr[j]>0){
                        count=0;
                        break;
                    }
                }
            }
//            for(int i=curr; i<=count; i++){
//                System.out.print(arr[i]);
//            }
        System.out.println(count);
        System.out.println(curr);
        for(int i=curr; i<size&&count!=0; i++){
            System.out.print(arr[i]);
            count--;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the arraY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        Solve(arr,size);
    }
}
