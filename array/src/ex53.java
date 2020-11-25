import java.util.Scanner;

public class ex53 {
    static void Solve(int arr[], int size){
//        if(size<3){
//            return;
//        }
//        for(int j=1; j<size; j++){
//            int i=j-1, k=j+1;
//            while(i>=0&&k<size){
//
//            }
//        }
        if(size<3)
            return;
        for(int j=1; j<size-1; j++){
            int i=j-1, k=j+1;
            while(true){
                while(i>=0&&k<=size-1&&(arr[j]%arr[i]==0)&&(arr[k]%arr[j]==0)&&(arr[j]/arr[i]==arr[k]/arr[j])){
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    k++;i--;
                }
                if(i<0||k>=size){
                    break;
                }
                if(arr[j]%arr[i]==0&&arr[k]%arr[j]==0){
//                    1 2 6 10 18 54
                    if(arr[j]/arr[i]<arr[k]/arr[j])
                        i--;
                    else
                        k++;
                }
                else if(arr[j]%arr[i]==0){
                    k++;
                }
                else i--;
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
