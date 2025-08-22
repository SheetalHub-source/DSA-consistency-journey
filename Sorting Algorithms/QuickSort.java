import java.util.Arrays;

public class QuickSort {
    
    public static void main(String[] args) {
        int[] arr ={3,7,4,3,7,9,0};
        System.out.println("Before sorting array:");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("\nAfter sorting array:");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }
            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j); 
        return j;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
