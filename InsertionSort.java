import java.util.Arrays;

public class InsertionSort{
    public static <T extends Comparable<? super T>> void insertionSort_Array(T[] arr){
        int n= arr.length;
        for(int i =1;i<n;i++){
            int j=i;
            while(j>0&&arr[j].compareTo(arr[j-1])<0){
                T temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

    }
    @SafeVarargs
    public static <T> T[] createArray(T...values){
        return values;
    }
    public static void main(String [] args){
    Integer intArray[] = createArray(9,7,6,4,3,2);
    System.out.println("Before Sorting array looks like...");
    Arrays.stream(intArray).forEach(x->System.out.print(x+" "));
    insertionSort_Array(intArray);
    System.out.println("\nAfter Sorting array looks like");
    Arrays.stream(intArray).forEach(x->System.out.print(x+" "));

    String stringArr[]=createArray("Karan","Sonam","Sheetal","Raj","Umang");
    System.out.println("Before Sorting array looks like...");
    Arrays.stream(stringArr).forEach(x->System.out.print(x+" "));
    insertionSort_Array(stringArr);
    System.out.println("\nAfter Sorting array looks like");
    Arrays.stream(stringArr).forEach(x->System.out.print(x+" "));
    }
}