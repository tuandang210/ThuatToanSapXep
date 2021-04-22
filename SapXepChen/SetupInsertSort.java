package SapXepChen;

import java.util.Arrays;
import java.util.Scanner;

public class SetupInsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int size = sc.nextInt();
        double[] arr = new double[size];
        System.out.println("Nhập " + arr.length + " phần tử và giá trị");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        setupInsertSort(arr);
    }

    public static void setupInsertSort(double[] array) {
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
}
