package sort;

public class SelectionSort {
    public static void sort(Integer[] arr) {
        for (int i = 0; i <arr.length/2; i++) {

            int min = i;
            int max = i;

            for (int j = i + 1; j < arr.length-i  ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;

            if (arr[i]==arr[max]) {
                tmp = arr[arr.length-i-1];
                arr[arr.length-i-1] = arr[min];
                arr[min] = tmp;
            }
            else {
                tmp = arr[arr.length-i-1];
                arr[arr.length-i-1] = arr[max];
                arr[max] = tmp;
            }

        }
    }
}
