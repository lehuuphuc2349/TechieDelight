import java.util.Scanner;

public class ex6 {
    static void Solve(int arr[], int sum) {
        int len = 0;
        int endingIndex = -1;
        int size = arr.length;
//        for(int i=0; i<size; i++){
//            for(int j=i; j<size; j++){
//               sumTemp+=arr[j];
//               if(sumTemp==sum){
//                    if(len<j-i+1){
//                        len = j - i + 1;
//                        endingIndex = j;
//                    }
//               }
//            }
//        }
        for (int i = 0; i < size; i++) {
            int sumTemp = 0;
            for (int j = i; j < size; j++) {
                sumTemp += arr[j];
                if (sumTemp == sum) {
                    if (len < j - i + 1) {
                        len = j - i + 1;
                        endingIndex = j;
                    }
                }
            }
        }
//        System.out.println("SUB ARRAY:[" + (endingIndex - len + 1) + "..." + endingIndex + "]");
        for(int i=(endingIndex-len+1); i<=endingIndex; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENTS OF THE ARRAY");
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i]+=input.nextInt();
        }
        System.out.println("INPUT TARGET SUM:");
        int sum = input.nextInt();
        Solve(arr,sum);
    }
}
