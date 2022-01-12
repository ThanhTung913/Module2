package ArrayAndFunction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxArrayOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 10;
        int max = 50;
        System.out.print("Nhập chiều dài mảng ngoài: ");
        int size = scanner.nextInt();
        System.out.print("Nhập chiều dài mảng trong: ");
        int size1 = scanner.nextInt();
        int[][] arr = new int[size][size1];
        for (int i = 0; i < size; i++) {
            arr[i] = new int[size1];
            System.out.println(" arr " + i);
            for (int j = 0; j < size1; j++) {
                arr[i][j] = (int) (Math.random() * (max - min + 1) + min);
                System.out.print(arr[i][j] + " ");
            }
            System.out.print(" ");
        }
        max(arr);
        System.out.println("phần tử lớn nhất trong mảng 2 chiều là:  " + max(arr));

    }

    public static int max(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
