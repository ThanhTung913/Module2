package OOP;

import javafx.scene.paint.Stop;

import java.util.Arrays;
import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public int[] arrRandom(int size) {
        int min = 10;
        int max = 50;
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    public void arraySort(int[] arr) {
        int minArr = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            minArr = arr[i];
            index = 0;
            int check = -1;
            for (int j = i; j < arr.length; j++) {
                if (minArr > arr[j]) {
                    minArr = arr[j];
                    index = j;
                    check = 1;
                }

            }
            if (check == 1) {
                arr[index] = arr[i];
                arr[i] = minArr;
            }
        }

    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] arr1 = stopWatch.arrRandom(10);
        System.out.println("Lúc chưa sort");
        System.out.println(Arrays.toString(arr1));
        stopWatch.arraySort(arr1);
        System.out.println();
        stopWatch.setStartTime();
        System.out.println("Lúc đã sort");
        stopWatch.arraySort(arr1);
        System.out.println(Arrays.toString(arr1));
        stopWatch.setEndTime();
        System.out.println(stopWatch.getElapsedTime());

    }
}
