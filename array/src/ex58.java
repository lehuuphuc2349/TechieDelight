import java.util.Scanner;

public class ex58 {
    static void Solve(int arr[], int size, int x, int y){
        if(size==0) return;
        int ans=Integer.MAX_VALUE, xIndex=size, yIndex=size;
//        for(int i=0; i<size; i++){
//           for(int j=0; j<size; j++){
//               if(arr[i]==x&&arr[j]==y){
//                    ans=Math.abs(Math.min((i-j),0));
//               }
//           }
//        }
        for(int i=0; i<size; i++){
            if(arr[i]==x){
                xIndex=i;
                if(yIndex!=size){
                   ans=Integer.min(ans,Math.abs(xIndex-yIndex));
                }
            }
            if(arr[i]==y){
                yIndex=i;
                if(xIndex!=size){
                    ans=Integer.min(ans,Math.abs(xIndex-yIndex));
                }
            }
        }
        System.out.println(ans);
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
        System.out.println("Enter x:");
        int x = in.nextInt();
        System.out.println("Enter y:");
        int y = in.nextInt();
        Solve(arr,size,x,y);
    }
}
