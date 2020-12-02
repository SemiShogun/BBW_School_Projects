import java.util.Arrays;

public class Sorter {

    static void selectionSort(int[] arr) {
        if (arr == null) {
            return;
        }

        for(int i = 1; i < arr.length; i++) {
            int swapIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[swapIndex]) {
                    swapIndex = j;
                }
            }
            swap(arr, i, swapIndex);
        }

        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr) {
        if (arr == null) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int splitPoint = partition(arr, low, high);
            quickSort(arr, low, splitPoint);
            quickSort(arr, splitPoint + 1, high);
        }
    }

    // Hoare partition algorithm
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1, j = high + 1;
        while (true) {
            do {
                i++;
            } while(arr[i] < pivot);
            do {
                j--;
            } while(arr[j] > pivot);
            if(i < j) {
                swap(arr, i, j);
            } else {
                return j;
            }
        }

    }

    static void insertionSort(int[] arr) {
        if (arr == null) {
            return;
        }

        for(int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j - 1, j);
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        if (arr == null) {
            return;
        }

//        boolean sorted = false;
//        while (!sorted) {
//            sorted = true;
//            for (int i = 1; i < arr.length; i++) {
//                if(arr[i] < arr[i - 1]) {
//                    swap(arr, i - 1, i);
//                    sorted = false;
//                }
//            }
//        }

        for(int i = 0; i < arr.length; i++) {
            for(int y = i+1; y < arr.length; y++) {
                if(arr[y] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[y];
                    arr[y] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
