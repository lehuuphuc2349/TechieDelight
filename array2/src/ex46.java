import java.util.Scanner;

public class ex46 {
//        int value, index, listSum;
//        Node(int value, int index, int listSUm){
//
//        }
//    }:
    static void Solve(int arr[], int size, int number){
        int left=0, right=size-1;
        int mid=(left+right)>>1;
        int first=0, last=0;
        while(left<size-1){
            if(arr[left]==number){
                first=left;
                break;
            }
            left++;
        }
        while(right>0){
            if(arr[right]==number){
                last=right;
                break;
            }
            right--;
        }
        if(first==0&&last==0){
            System.out.println("Element Not Found!");
            return;
        }
        System.out.println(first+","+last);
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
        System.out.println("Enter target number:");
        int number = in.nextInt();
        Solve(arr,size,number);
    }
}
