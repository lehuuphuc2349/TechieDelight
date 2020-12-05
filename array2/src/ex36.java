import java.util.Scanner;

public class ex36 {
//    static int Solve(int arr[], int size, int i, int prev){
//       if(size==0) return 0;
//       int excl=Solve(arr,size,i++,prev);
//       int incl=0;
//       if(prev+1!=i){
//           incl=Solve(arr,size,i+1,prev)+arr[i];
//       }
//       return Integer.max(incl,excl);
//    }
    static int Solve(int arr[], int size, int i, int prev){
        if(i==size) return 0;
        int excl=Solve(arr,size,i+1,prev);
        int incl=0;
        if(prev+1!=i)
            incl=Solve(arr,size,i+1,i)+arr[i];
        return Integer.max(incl,excl);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++)
            arr[i] = in.nextInt();
        if(Solve(arr,size,0,Integer.MIN_VALUE)!=0)
            System.out.println("Result is: " + Solve(arr,size,0,Integer.MIN_VALUE));
        else
            System.out.println("Input Invalid");
//        int result = Solve(arr,size,0,Integer.MIN_VALUE);
//        System.out.println("Result : " + result);
    }
}
