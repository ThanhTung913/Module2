package OOP;

import java.util.Arrays;
import java.util.Scanner;

public class StopWatch2 {
    private long startTime;
    private long endTime;

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public int[] arrRandom(int size) {
        int[] arr = new int[size];
        int min = 10;
        int max = 50;
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    public void arrSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int min = arr[i];
            int index = 0;
            boolean check = false;
            for (int j = i; j < size; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            if (check == true) {
                arr[index] = arr[i];
                arr[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        StopWatch2 stopWatch2 = new StopWatch2();
         int[] arr2 = stopWatch2.arrRandom(1000);
        stopWatch2.setStartTime();
        System.out.println("Trước khi sort: ");
        System.out.println(Arrays.toString(arr2));
        stopWatch2.arrSort(arr2);
        System.out.println("Sau khi sort:");
        System.out.println(Arrays.toString(arr2));
        stopWatch2.setEndTime();
        System.out.println(" Thời gian chạy là: " + stopWatch2.getElapsedTime());
    }

}
