import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class SelectionSort {

    public static void SelectionSort_For_Array(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_Value = arr[i];
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min_Value) {
                    min_Value = arr[j];
                    min_idx = j;
                }
            }
            swap(arr, min_idx, i);
        }
    }

    public static void swap(int[] arr, int min_idx, int i) {
        if (min_idx != i) {
            // XOR Swap
            arr[min_idx] = arr[min_idx] ^ arr[i];
            arr[i] = arr[min_idx] ^ arr[i];
            arr[min_idx] = arr[min_idx] ^ arr[i];
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of the array:");
        int n = Integer.parseInt(bufferedReader.readLine());
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of arr[" + i + "]:");
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        System.out.println("Before Sorting, Array looks like this:");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();

        SelectionSort_For_Array(arr);

        System.out.println("Sorted Array looks like this:");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}
