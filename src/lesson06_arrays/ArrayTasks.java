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
        System.out.println();
    }

    public static void reverse(int[] arr) {
        int replace = arr[arr.length-1];
        int index = arr.length-1;
        for (int i = 0; i<arr.length/2;i++) {
             arr[index]=arr[i];
             arr[i]=replace;
             index--;
             replace = arr[index];
        }
    }

    public static boolean contains(int[] arr, int num) {
        for (int n: arr) {
            if (n==num) return true;
        }
        return false;
    }

    public static int findIndex(int[] arr, int num) {
        int counter = 0;
        for (int n: arr) {
            if (n==num) return counter;
            counter++;
        }
        return -1;
    }

    public static int[] copy(int[] arr) {
        int[] newArr=new int[arr.length];
        for (int i = 0;i<arr.length;i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }

    public static int[] append(int[] arr,int value) {
        int[] newArr=new int[arr.length+1];
        for (int i = 0;i<arr.length;i++) {
            newArr[i]=arr[i];
        }
        newArr[arr.length]=value;
        return newArr;
    }

    public static int[] removeLast(int[] arr) {
        int[] newArr=new int[arr.length-1];
        for (int i = 0;i<arr.length-1;i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }

    public static int[] insert(int[] arr, int index, int value) {
        int[] newArr=new int[arr.length+1];
        for (int i = 0;i<arr.length+1;i++) {
            if (i==index) {
                newArr[i]=value;
                continue;
            }
            if (i<index) {
                newArr[i] = arr[i];
            }
            if (i>index) newArr[i]=arr[i-1];
        }
        return newArr;
    }




    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        printArr(numbers);
        System.out.println();
        System.out.println("Поиск наибольшего: " + findMax(numbers));
        System.out.println("Поиск наименьшего: " + findMin(numbers));
        System.out.println("Поиск суммы: " + findSum(numbers));
        System.out.println("Поиск среднего: " + findAverage(numbers));
        System.out.println("Поиск количества числа 8: " + countOccurrences(numbers, 8));
        reverse(numbers);
        printArr(numbers);
        System.out.println(contains(numbers,3));
        System.out.println(findIndex(numbers,4));
        printArr(copy(numbers));
        printArr(append(numbers,10));
        printArr(removeLast(numbers));
        printArr(insert(numbers,1,2000));
    }
}
