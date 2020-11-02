import java.util.Scanner;

public class ex5v1 {
//    COUNT DUPLICATE ElEMENTS
    static int count(boolean isTrue){
        int count=0;
        while(isTrue)
            count++;
        return count;
    }
    static int Solve(int arr[]){
       boolean visited[] = new boolean[arr.length+1];
       for(int value: arr){
           if(visited[value])
               return value;
           visited[value]=true;
       }
       return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENTS OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i]+=input.nextInt();
        }
        if(Solve(arr)!=1)
            System.out.println("Duplicate Element: " + Solve(arr));
        else
            System.out.println("Do Not Duplicate Element");
    }
}
