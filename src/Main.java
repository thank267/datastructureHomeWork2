

import sort.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArray.isRepeat = false;
        MyArray.isShuffle = true;
        final int SIZE = 10;
        Integer[] arr = MyArray.getArray(SIZE, 2);

        System.out.println(Arrays.toString(arr));

        SelectionSort.sort(arr); //3360

        System.out.println(Arrays.toString(arr));

    }
}
