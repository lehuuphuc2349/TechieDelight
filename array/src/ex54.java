import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ex54 {
    static void Solve(int i, int n, int ans[], int index){
//        for(int i=1; i<=n; i++){
//            int sum=0;
//            while(true){
//                sum+=i;
//                if(sum==n){
//                    System.out.println(i);
//                }
//            }
//        }
        if(n==0)
            System.out.println(Arrays.stream(ans).limit(index).boxed().collect(Collectors.toList()));
        for(int j=i; j<=n; j++){
            ans[index]=j;
            Solve(j,n-j,ans,index+1);
        }


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT POSITIVE INTEGER N:");
        int n = in.nextInt();
        int ans[] = new int[n];
        Solve(1,n,ans,0);
    }
}
