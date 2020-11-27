import java.util.*;

public class ex71 {
    static class Pair{
       int x, y;
       Pair(int x, int y){
           this.x=x;
           this.y=y;
       }
    }
    static void Solve(int arr[], int size){
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i=0; i<size-1; i++){
//           for(int j=i+1; j<size; j++){
//               if(map.containsKey(arr[i]+arr[j])){
//                   System.out.println(arr[i]+","+arr[j]);
//                   return;
//               }
//               else map.put(arr[i]+arr[j],i);
//           }
//        }
        Map<Integer, List<Pair>> map = new HashMap<>();
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                int sum=arr[i]+arr[j];
                if(map.containsKey(sum)){
                    for(Pair pair: map.get(sum)){
                        int m=pair.x;
                        int n=pair.y;
                        if((m!=i&&m!=j)&&(n!=i&&n!=j)){
                            System.out.println("First Pair: " + arr[i]+","+arr[j]);
                            System.out.println("Second Pair: " + arr[m]+","+arr[n]);
                            return;
                        }
                    }
                }
                map.putIfAbsent(sum, new ArrayList<>());
                map.get(sum).add(new Pair(i,j));
            }
        }
        System.out.println("No Non-OverLapping pair");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = in.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[] = new int[size];
        for(int i=0; i<size ;i++){
            arr[i] = in.nextInt();
        }
        Solve(arr,size);
    }
}
