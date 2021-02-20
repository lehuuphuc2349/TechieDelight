import java.util.Scanner;

public class ex37 {
        static int Solve(int arr1[], int arr2[]){
            int sum=0;
            int sumX=0, sumY=0;
            int m= arr1.length, n=arr2.length;
            int i=0, j=0;
            while(i<m&&j<n){
                while(i<m-1&&arr1[i]==arr1[i+1]){
                    sumX+=arr1[i++];
                }
                while(j<n-1&&arr2[j]==arr2[j+1]){
                    sumY+=arr2[j++];
                }
                if(arr2[j]<arr1[i]){
                    sumY+=arr2[j];
                    j++;
                }
                else if(arr2[j]>arr1[i]){
                    sumX+=arr1[i];
                    i++;
                }
                else{
//                    sum+=Integer.max(maxX,maxY)+arr1[i];
                    sum+=Integer.max(sumX,sumY)+arr1[i];
                    i++;j++;
                    sumY=0;
                    sumX=0;
                }
        }
        while(i<m)
            sumX+=arr1[i++];
        while(j<n)
            sumY+=arr2[j++];
        sum+=Integer.max(sumX,sumY);
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY1:");
        int size1 = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY1:");
        int arr1[] = new  int[size1];
        for(int i=0; i<size1; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("INPUT SIZE OF THE ARRAY2:");
        int size2 = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY2:");
        int arr2[] = new int[size2];
        for(int i=0; i<size2; i++){
            arr2[i] = input.nextInt();
        }
        System.out.println("Result is a: " + Solve(arr1,arr2));
    }
}
