import java.util.Arrays;

public class BubbleSort {
  
    @SafeVarargs
    public static <T> T[] createArray(T... values) {
        return values;
    }

    public static <T extends Comparable<? super T>> void BubbleSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer intArray[] = createArray(5, 4, 3, 2, 1);
        String stringArray[] = createArray("Sheetal", "Karan", "Priyanka", "Sonam", "Uday", "Anshul", "Priyank-a", "Payal");

        System.out.println("Before sorting arrays are:");
        Arrays.stream(intArray).forEach(x -> System.out.print(x + " "));
        System.out.println();
        Arrays.stream(stringArray).forEach(x -> System.out.print(x + " "));

        BubbleSort(intArray);
        BubbleSort(stringArray);

        System.out.println();
        System.out.println("After Sorting Arrays are...");
        Arrays.stream(intArray).forEach(x -> System.out.print(x + " "));
        System.out.println();
        Arrays.stream(stringArray).forEach(x -> System.out.print(x + " "));

        // Sorting custom objects
        Person mother = new Person("Uma Rajput", 35);
        Person father = new Person("Jogendra Singh Rajput", 55);
        Person child = new Person("Sheetal Rajput", 22);

        Person[] persons = createArray(mother, father, child);

        System.out.println("\n\nBefore sorting persons:");
        Arrays.stream(persons).forEach(x -> System.out.println(x));

        BubbleSort(persons);

        System.out.println("\nAfter sorting persons (by age):");
        Arrays.stream(persons).forEach(x -> System.out.println(x));
    }

    // Person must implement Comparable so we can sort it
    public static class Person implements Comparable<Person> {
        String name;
        Integer age;

        Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        // Sorting based on age
        @Override
        public int compareTo(Person other) {
            return this.age.compareTo(other.age);
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
}
