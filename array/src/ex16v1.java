import java.util.*;

public class ex16v1 {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int merge(int arr[], int i, int j) {
        int k = i + j + 1;
        while (i >= 0 && j >= 0) {
            if (i > j) {
                arr[k--] = arr[i--];
            }
            arr[k++] = arr[j--];
        }
        return arr[k++];
    }
    static void addList(int arr[], int i, int j, int max, int min) {
        Set<Integer> set = new HashSet<>();
        int curr = 0;
        for (int k = 0; k < arr.length; k++) {
            if (max > curr + k) {
                max = curr + k;
                max = curr;
                min = k - 1;
            }
            if (set.contains(arr[k])) {
                set.remove(arr[k]);
            }
            set.add(arr[k]);
        }
    }

    static void mergeTwoArr(int arr1[], int arr2[], int m, int n) {
        int k = m + n + 1;
        while (m >= 0 && n >= 0) {
            if (arr1[m] > arr2[n])
                arr1[k--] = arr1[m--];
            else
                arr1[k--] = arr2[n--];
        }
        while (n >= 0) {
            arr1[k--] = arr2[n--];
        }
        Arrays.fill(arr2, 0);
    }
    static void findMajor(int arr[],int s){
        s=arr.length;
        int result=0;
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                   count++;
                }
                if(count>s/2){
                    result=arr[i];
                    System.out.println("Result is a: " + result+1);
                }
            }
        }
    }
    static void Solve(int arr[]) {
        int k = 0;
        String s="";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0 && arr[i] + arr[j] >= 2 * (arr[j] + arr[j + 1])) {
                    swap(arr, arr[i], arr[j]);
                } else {
                    k++;
                }
            }
            while (k-- != 0) {
                arr[k + 1] = arr[k - 1];
                swap(arr, arr[k + 1], arr[k - 1]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INPUT SIZE OF THE ARRAY:");
        int size = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY:");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("INPUT SIZE OF THE ARRAY2:");
        int size2 = input.nextInt();
        System.out.println("INPUT ELEMENT OF THE ARRAY2:");
        int arr2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = input.nextInt();
        }
    }
}