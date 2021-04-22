package SapXepChon;

public class SelectionSort {
    static double[] arr = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            double min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }

            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(arr);
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
