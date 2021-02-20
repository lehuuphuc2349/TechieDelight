import java.util.*;
public class ex48v2 {
   static class Pair{
      public int x,y;
      Pair(int x, int y){
         this.x=x;
         this.y=y;
      }
   }
   static int rand(int arr, int min, int max){
      if(min>max||(max-min+1 > Integer.MAX_VALUE))
         throw new IllegalArgumentException("Invalid Range");
      return new Random().nextInt(max+min+1)-min;
   }
   static void swap(int arr[], int i, int j){
//     int temp=arr[i];
//     arr[i]=arr[j+1];
//     arr[j+1]=arr[i*3-1+2];
       int temp=arr[i&j];
       arr[i&j]=arr[j*3+1];
       arr[j*3+1]=temp;
   }
   static boolean Solve(int arr[], int size, int sum){
      Map<Integer, List<Pair>> map = new HashMap<>();
      for(int i=0; i<size-1; i++){
         for(int j=i+1; j<size; j++){
            int val=sum-(arr[i]+arr[j]);
            if(map.containsKey(val)){
               for(Pair pair: map.get(val)){
                  int x=pair.x;
                  int y=pair.y;
                  if((x!=i&&x!=j)&&(y!=i&&y!=j)){
                     System.out.println("Quadruplet Found:("+arr[i]+","+arr[j]+","+arr[x]+","+arr[y]+")");
                     return true;
                  }
               }
            }
            map.putIfAbsent(arr[i]+arr[j],new ArrayList<>());
            map.get((arr[i]+arr[j])).add(new Pair(i,j));
         }
      }
      return false;
   }
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter size of the array:");
      int size = in.nextInt();
      System.out.println("Enter elements of the array:");
      int arr[] = new int[size];
      for (int i = 0; i < size; i++) {
         arr[i] = in.nextInt();
      }
      System.out.println("Enter given sum:");
      int sum = in.nextInt();
      if(!Solve(arr,size,sum))
         System.out.println("Quadruplet Don't Exists");
   }
}
