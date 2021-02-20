import java.util.HashSet;
import java.util.Scanner;

public class ex15v2 {
    static void Solve(int arr[]){
        int max=0, start=0, end=0, currStr=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<=arr.length; i++){
            if(max<i-currStr){
                max=i-currStr;
                start=currStr;
                end=i-1;
            }
            if(i==arr.length){
                System.out.println("The Largest Sub-Array is a: [" + start + "," + end+"]");
                break;
            }
            if(set.contains(arr[i])){
                while(arr[currStr]!=arr[i]){
                    set.remove(arr[currStr]);
                    currStr++;
                }
                currStr++;
            }
            else set.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=input.nextInt();
        }
        Solve(arr);
    }
}
