package lesson06_arrays;

public class ArrayTasks {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1;i<arr.length;++i) {
            if (max<arr[i]) max = arr[i];
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1;i<arr.length;++i) {
            if (min>arr[i]) min = arr[i];
        }
        return min;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum+= num;
        return sum;
    }

    public static int countOccurrences(int[] arr, int value) {
        int counter = 0;
        for (int num:arr) {
            if (value==num) counter++;
        }
        return counter;
    }

    public static double findAverage(int[] arr) {
        return ((double)findSum(arr)/arr.length);
    }

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 8, 3, 8, 2, 8, 10};
        printArr(numbers);
        System.out.println();
        System.out.println("Поиск наибольшего: " + findMax(numbers));
        System.out.println("Поиск наименьшего: " + findMin(numbers));
        System.out.println("Поиск суммы: " + findSum(numbers));
        System.out.println("Поиск среднего: " + findAverage(numbers));
        System.out.println("Поиск количества числа 8: " + countOccurrences(numbers, 8));
    }
}
