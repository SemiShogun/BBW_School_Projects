public class Application {

    public static void main(String[] sorter) {
        int[] values = {324,32, 3,63,431,2,34,36,23,76432,65,652,6,64,76,32424,4};


        // My sort:     7443700
        // Eric's sort: 7541200
        System.out.println("Bubblesort");
        final long bubblesortStart = System.nanoTime();
        Sorter.bubbleSort(values);
        final long bubblesortEnd = System.nanoTime();
        System.out.println("Time: " + (bubblesortEnd - bubblesortStart));
        System.out.println();

        System.out.println("Selectionsort");
        Sorter.selectionSort(values);
        System.out.println();

        System.out.println("Insertionsort");
        Sorter.insertionSort(values);
        System.out.println();

        System.out.println("Quicksort");
        final long quicksortStart = System.nanoTime();
        Sorter.quickSort(values);
        final long quicksortEnd = System.nanoTime();
        System.out.println("Time: " + (quicksortEnd - quicksortStart));
        System.out.println();
    }
}
