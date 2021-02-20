import java.util.Scanner;

public class ex11 {
    static void Solve(int arr[], int size, int k){
        if(size==0||k<0||k>size){
            return;
        }
        for(int i=0; i<size; i++){
            for(int j=i+1; j<=k; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicates Found");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the araray:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter k:");
        int k = in.nextInt();
        Solve(arr,size,k);
    }
}
