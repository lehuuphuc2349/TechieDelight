import java.util.Scanner;

public class ex52 {
    static void Solve(int arr[], int size){
        if(size<3)
            return;
        for(int j=1; j<size; j++){
            int i=j-1, k=j+1;
            while(i>=0&&k<size){
                if(arr[i]+arr[k]==2*arr[j]){
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    k++;i--;
                }
                else if(arr[i]+arr[k]<2*arr[j]){
                    k++;
                }else i--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER SIZE OF THE ARRAY:");
        int size = in.nextInt();
        System.out.println("ENTER ELEMENTS OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        Solve(arr,size);
    }
}
