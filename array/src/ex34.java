import java.util.*;

public class ex34 {
    static void Solve(int arr[]){
        String arrayStr=Arrays.toString(arr);
        List<String> list = Arrays.asList("10","68","75","7","21","12");

        Collections.sort(list,(a,b) -> (b+a).compareTo(a+b));
        list.stream().forEach(System.out::print);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        Solve(arr);
    }
}
