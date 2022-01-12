package ArrayAndFunction;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 10;
        int max = 50;
        System.out.println(" Nhập size");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        System.out.println("Mảng  2 chiều");
        for (int i = 0; i< size; i++){
            arr[i] = new int[size];
            System.out.println("arr " + i) ;
            for (int j = 0; j< size; j++ ){
                arr[i][j] = (int) (Math.random() * (max + min - 1) + min);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(total(arr));
    }
    public static int total(int[][] arr){
        int tong =0;
        for (int i = 0; i < arr.length; i++ ){
            tong += arr[i][i];
        }
        return tong;
    }
}

