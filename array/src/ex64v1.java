import java.util.Scanner;

public class ex64v1 {
    static void Solve(int arr[], int size){
        if(size<=2){
            System.out.println("No Triplet exists since the array has less than 3 elements");
        }
        int m1=0, m2=-1, m3=-1;
        for(int i=1; i<size; i++){
            if(arr[i]>arr[m1]){
                m3=m2;
                m2=m1;
                m1=i;
            }else if(m2==-1||arr[i]>arr[m2]){
                m3=m2;
                m2=i;
            }else if(m3==-1||arr[i]>arr[m3]){
                m3=i;
            }
        }
        int min1=0, min2=-1;
        for(int i=1; i<size; i++){
            if(arr[i]<arr[min1]){
                min2=min1;
                min1=i;
            }else if(min2==-1&&min2<arr[i]){
                min2=i;
            }
        }
        if(arr[m3]*arr[m2]*arr[m1]>arr[min1]*arr[min2]*arr[m1])
            System.out.println("Triplet is: " + arr[m1]+","+arr[m2]+","+arr[m3]);
        else
            System.out.println("Triplet is: " + arr[min1]+","+arr[min2]+","+arr[m1]);
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
