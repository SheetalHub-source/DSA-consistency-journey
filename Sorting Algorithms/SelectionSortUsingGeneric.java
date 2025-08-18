import java.util.Arrays;

public class SelectionSortUsingGeneric {

    public static <T extends Comparable<? super T>> void selectionSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min_idx]) < 0) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                swap(arr, min_idx, i);
            }
        }
    }

    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArr = {64, 25, 12, 22, 11};
        selectionSort(intArr);
        System.out.println("Sorted Integers: " + Arrays.toString(intArr));

        // String array
        String[] strArr = {"Banana", "Apple", "Orange", "Mango"};
        selectionSort(strArr);
        System.out.println("Sorted Strings: " + Arrays.toString(strArr));

        // Double array
        Double[] doubleArr = {3.14, 1.41, 2.71, 0.57};
        selectionSort(doubleArr);
        System.out.println("Sorted Doubles: " + Arrays.toString(doubleArr));
    }
}
