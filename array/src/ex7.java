import java.util.Scanner;

public class ex7 {
    static void Solve(int arr[]){
        int len=0;
        int end=-1;
        int zeros=0;
        int one=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[j]==0){
                    zeros++;
                }
                else {
                    one++;
                }
                if((len<j-i+1)&&(zeros==one)){
                    len = j - i + 1;
                    end = j;
                }
            }
        }
        for(int i=(end-len+1); i <=end; i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENTS OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i]+=input.nextInt();
        }
        Solve(arr);
    }
}
