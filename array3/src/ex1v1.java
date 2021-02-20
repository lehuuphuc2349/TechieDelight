import java.util.Arrays;
import java.util.Scanner;

public class ex1v1 {
    static int gcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
    static void solve(int arr[], int size, int d){
        d=d%size;
//        d = 2;
        int i,j,k,temp;
        int GCD=gcd(d,size);
        System.out.println(GCD);
        for(i=0; i<GCD; i++){
            temp=arr[i];
            j=i;
            while(true){
                k=j+d;
//                1 2 3 4 5 6 7 8 9 10 11 2
                if(k>=size)
                    k-=size;
                if(k==i)
                    break;
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }
    }
    static void leftRotateByOne(int arr[], int size, int d){
        int i, temp;
        temp=arr[0];
        for(i=0; i<size-1; i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
    }
    static void solve2(int arr[], int size, int d){
        for(int i=0; i<d; i++){
            leftRotateByOne(arr,size,d);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        int d = in.nextInt();
        System.out.println("Before: " + Arrays.toString(arr));
//        [1 2 3 4 5 6 7 8 9 10 11 2]
        solve(arr,size,d);
        System.out.println("After First: " + Arrays.toString(arr));
//        [4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3]
        solve2(arr,size,d);
        System.out.println("After second: " + Arrays.toString(arr));
//        [7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6]
    }
}
