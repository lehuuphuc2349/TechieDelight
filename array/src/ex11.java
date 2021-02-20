import java.util.Scanner;

public class ex11 {
    static void Solve(int arr[]){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0&&i>max){
                max = i;
            }
        }
        System.out.println("Find Index:" + max);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int sz = in.nextInt();
        System.out.printf("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[sz];
        for(int i=0; i<sz; i++){
            arr[i]=in.nextInt();
        }
        Solve(arr);
    }
}
