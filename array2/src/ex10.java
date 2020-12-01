import java.util.Scanner;

public class ex10 {
    static void Solve(int arr[], int size){
        if(size<2){
            System.out.println(arr);
            return;
        }
        int count=0;
        int exit=0;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
//                if(arr[j]<arr[i]&&exit==3){
//                    break;
//                }else{
//                    count++;
//                    exit++;
//                }
                if(arr[j-1]>=arr[j]){
                    break;
                }else count++;
            }
        }
        if(count==0){
            System.out.println("The number of stricly incre subarray are 0");
            return;
        }
        System.out.println("Result: " + count);
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
        Solve(arr,size);
    }
}
