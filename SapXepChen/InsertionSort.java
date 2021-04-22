package SapXepChen;

import java.util.Arrays;

public class InsertionSort {
    static double[] arr = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void insertSort(double[] array) {
        for (int i = 1; i < array.length; i++) {
            double temp = array[i];
            int j = i - 1;
            for (; j >= 0 && array[j] > temp; j--) {
                // Moves the value greater than temp back by one unit
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        insertSort(arr);
    }
}
//temp =4.5   j=2   1,9,9,6.6