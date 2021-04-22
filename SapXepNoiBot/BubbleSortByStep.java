package SapXepNoiBot;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhập "+arr.length+" phần tử và giá trị");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        bubbleSortByStep(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSortByStep(int[] arr) {
        boolean needNextPass = true;
        for (int k = 1; k < arr.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + arr[i] + " with " + arr[i + 1]);
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }
    }
}
