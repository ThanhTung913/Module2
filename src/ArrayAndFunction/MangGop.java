package ArrayAndFunction;

import java.util.Scanner;

public class MangGop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng 1: ");
        int size1 = Integer.parseInt(scanner.nextLine());
        int arr1[] = new int[size1];
        nhapMang(size1, arr1);
        xuatMang(size1, arr1);
        System.out.println("Nhập chiều dài mảng 2: ");
        int size2 = Integer.parseInt(scanner.nextLine());
        int arr2[] = new int[size2];
        int min = 10;
        int max = 50;
       nhapMang(size2,arr2);
    xuatMang(size2, arr2);
    xuatMang(gopArr(arr1,arr2).length,gopArr(arr1,arr2));

    }
    public static int[] gopArr(int[] arr1, int[] arr2){
        int size1 = arr1.length;
        int size2 = arr2.length;
        int size = size1 + size2;
         int arr[] = new int[size];


        for ( int i = 0; i < size1; i++){
            arr[i] = arr1[i];
        }
        for (int j = 0; j < (size - size1); j++){
            arr[size1+j] = arr2[j];
        }
        return arr;
    }
    public static int[] nhapMang(int size, int[] arr){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<size;i++){
            System.out.print("arr[" +i+"]=");
            arr[i]= scanner.nextInt();
        }
        return arr;
    }
    public static void xuatMang(int size, int[] arr){
        System.out.print("Các phần tử của mảng là:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
