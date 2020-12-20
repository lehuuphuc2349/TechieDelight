import java.util.Scanner;

public class ex6 {
    static int solve(int arr[], int size, int l, int h, int k){
        if (l>h){
            return -1;
        }
        int m=(l+h)>>1;
        if(arr[m]==k){
            return m;
        }
        if(arr[l]<arr[m]){
            if(k>=arr[l]&&k<=arr[m]){
                return solve(arr,size,l,m-1,k);
            }
            return solve(arr,size,m+1,h,k);
        }
        if(k>=arr[m]&&k<=arr[h]){
            return solve(arr,size,m+1,h,k);
        }
        return solve(arr,size,l,m-1,k);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        int index=solve(arr,size,0,size-1,k);
        if(index!=-1)
            System.out.println("RESULT : " + index);
        else
            System.out.println("Wrong Input");
    }
}
