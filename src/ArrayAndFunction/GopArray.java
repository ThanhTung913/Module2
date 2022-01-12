package ArrayAndFunction;

import java.util.Scanner;

public class GopArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int min = 50;
        int max = 100;

        for (int i = 0; i < size; i++) {
            arr1[i] = (int) (Math.random() * (max - min + 1) + min);
            arr2[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        System.out.println("Đây là arr1");
        for (int a : arr1) {
            System.out.println(a);
        }

        System.out.println("Đây là arr2");
        for (int a : arr2) {
            System.out.println(a);
        }

        System.out.println("Đây là new arr");
        for (int a:gopArr(arr1, arr2)) {
            System.out.println(a);
        }
    }

    public static int[] gopArr(int arr1[], int arr2[]) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int size = size1 + size2;

        int[] arr = new int[size];
        for (int i =0; i < size1; i++){
            arr[i] = arr1[i];
        }
        for (int j = size1, i =0; i < size2; j++, i++){
            arr[j] = arr2[i];
        }
        return arr;
    }

}
