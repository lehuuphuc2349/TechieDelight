import java.util.Scanner;

public class ex61v1 {
    static int Solve(int value[], int weight[], int size, int w){
        int result[][] = new int[size+1][w+1];
        for(int i=1; i<=size; i++){
            for(int j=0; j<=w; j++){
                if(weight[i-1]>j){
                    result[i][j]=result[i-1][j];
                }else{
                    result[i][j]=Integer.max(result[i-1][j],result[i-1][j-weight[i-1]]+value[i-1]);
                }
            }
        }
        return result[size][w];
    }
    public static void main(String[] args) {
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
        System.out.println("Result: " + Solve(value,weight,size,w));
    }
}
