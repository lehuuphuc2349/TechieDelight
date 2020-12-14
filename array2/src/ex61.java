import java.util.Scanner;

public class ex61 {
    static int Solve(int value[], int size, int weight[], int w){
        if(w<0)
            return Integer.MIN_VALUE;
        if(size<0||w==0)
            return 0;
        int include=value[size]+Solve(value,size-1,weight,w-weight[size]);
        int exclude=Solve(value,size-1,weight,w);
        return Integer.max(include,exclude);
    }
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the value:");
        int size = in.nextInt();
        System.out.println("Enter elements of the value:");
        int value[] = new int[size];
        for(int i=0; i<size; i++){
            value[i] = in.nextInt();
        }
        System.out.println("Enter elements of the weight:");
        int weight[] = new int[size];
        for(int i=0; i<size; i++){
            weight[i] = in.nextInt();
        }
        System.out.println("Enter W:");
        int w = in.nextInt();
        System.out.println("Result is a: " + Solve(value,size-1,weight,w));
    }
}
