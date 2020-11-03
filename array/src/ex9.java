import java.util.*;

public class ex9 {
    static void Solve(int arr1[],int arr2[]){
        int tempArr[] = new int[arr1.length + arr2.length];
//        int k=0;
//        while(k<=arr1.length-1){
//            tempArr[k++]=arr1[k];
//        }
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
//        for(int i=arr1.length-1; i < arr2.length; i++) {
//            set.add(arr2[i]);
//        }
        for(int i=0; i < arr2.length; i++){
            set.add(arr2[i]);
        }
        for(int value: set) {
            System.out.println(value);
        }
        for(int i=0 ; i < arr1.length; i++) {
            tempArr[i]+=arr1[i];
        }
        int k=0;
        for(int i=arr1.length; i < tempArr.length; i++){
            tempArr[i]+=arr2[k++];
        }
        System.out.println(Arrays.toString(tempArr));
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
    }
    static void app(int arr1[],int arr2[]){
        List<Integer> list = new LinkedList<>();
        for(int i=0; i < arr1.length; i++) {
            for(int j = i + 1; j < arr1.length ;j++){
                if(arr1[i] == arr2[j]) {
                    System.out.println("FAIL");
                }
                else
                    System.out.println("TRUE");
//                    arr1.pushBack();
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY1:");
        int size1 = input.nextInt();
        System.out.println("INOUT ELEMENT OF THE ARRAY1:");
        int arr1[] = new int[size1];
        for(int i=0; i<size1; i++){
            arr1[i]+=input.nextInt();
        }
        System.out.println("INPUT SIZE OF THE ARRAY2:");
        int size2 = input.nextInt();
        System.out.println("INPUT ELEMENTS OF THE ARRAY2:");
        int arr2[] = new int[size2];
        for(int i=0; i<size2; i++){
            arr2[i]+=input.nextInt();
        }
        Solve(arr1,arr2);
    }
}
