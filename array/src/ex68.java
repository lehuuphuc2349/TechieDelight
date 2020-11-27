import java.util.*;

public class ex68 {
    static int rand(int min, int max){
        if(min>max||(max-min+1>Integer.MAX_VALUE)){
            throw new IllegalArgumentException("Invalid Range");
        }
        return new Random().nextInt(max-min+1)-min;
    }
    static int Solve(List<Integer>list){
        Map<Integer,Integer> map = new HashMap<>();
        for(int value : list){
            map.put(value,map.getOrDefault(value,0)+1);
        }
        int maxOccur=list.get(0);
//        for(var pair : map.entrySet()){
//           if(map.get(maxOccur)<pair.getValue()){
//
//           }
//        }
//        for(var pair : map.entrySet()){
//            if
//        }
        return-1;
//        Var in jdk10;
    }
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter size of the list:");
//        int size = in.nextInt();
//        System.out.println("Enter elements of the list:");
////        int arr[] = new int[size];
////        for(int i=0; i<size; i++){
////            arr[i] = in.nextInt();
////        }
        List<Integer> list = Arrays.asList(4, 3, 6, 8, 4, 6, 2, 4, 5, 9, 7, 4);
        for(int i=0; i<5; i++){
            System.out.println("Index of minimun probability: " + Solve(list));
        }

    }
}
