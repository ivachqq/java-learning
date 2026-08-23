package lesson17_multiArrays;

public class Main {
    public static int sumAll(int[][] arr) {
        int sum=0;
        for (int i = 0;i<arr.length;i++) {
            for (int j = 0; j<arr[i].length;j++) {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static int sumRow(int[][] arr, int row) {
        int sum=0;
        for (int i =0;i<arr[row].length;i++) {
            sum+=arr[row][i];
        }
        return sum;
    }
    public static int sumCol(int[][] arr, int col) {
        int sum=0;
        for (int j =0;j<arr.length;j++) {
            if (col<arr[j].length) {
            sum+=arr[j][col];}
            else continue;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num=1;
        int[][] arr = new int[3][4];
        for (int i = 0;i<arr.length;i++) {
            for (int j = 0; j<arr[i].length;j++) {
                arr[i][j]=num++;
            }
        }
        for (int i = 0;i<arr.length;i++) {
            for (int j = 0; j<arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println(sumAll(arr));
        System.out.println(sumRow(arr,2));
        System.out.println(sumCol(arr,1));

        System.out.println();
        int[][] arr2 = new int[3][];
        arr2[0]=new int[] {1,2,3};
        arr2[1]=new int[] {1,2,3,4};
        arr2[2]=new int[] {1,2};
        for (int i = 0;i<arr2.length;i++) {
            for (int j = 0; j<arr2[i].length;j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        //длина может отличаться, ибо массив хранит в себе лишь ссылки на другие массивы, а вот уже 1d массивы обязаны заранее иметь фиксированную длину


        //чем int[][] в памяти отличается от «одной большой таблицы» в Excel?
        //массив имеет в себе не конкретные значения, а лишь ссылки на 1 массивы, которые уже как раз хранят значения
    }
}
