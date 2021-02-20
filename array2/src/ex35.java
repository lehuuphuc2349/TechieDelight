import java.util.Scanner;

public class ex35 {
    static int Solve(int arr[], int size, int target){
        if(target==0) return 1;
        if(size<0) return 0;
        int excl=Solve(arr,size-1,target);
        int incl=Solve(arr,size-1,target-arr[size])+Solve(arr,size-1,target+arr[size]);
        System.out.println(incl);
        return excl+incl;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elemenst of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
            arr[i]=in.nextInt();
        System.out.println("Enter target:");
        int target = in.nextInt();
        System.out.println("Result is a: " + Solve(arr,size-1,target));
    }
}
