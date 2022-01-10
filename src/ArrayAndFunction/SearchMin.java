package ArrayAndFunction;

import java.util.Scanner;

public class SearchMin {
    public static void main(String[] args) {
        min();
    }


    public static void min() {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];
        int min = 0;
        System.out.println("Nhập vào các giác trị từ 0 đến 100");
        for (int i = 0; i< 10; i++){
            number[i] = scanner.nextInt();
            if ( i == 0){
                min = number[0];
            } else  if (number[i] < min){
                number[i] = min;
            }
        }
        System.out.println("Giá trị nhỏ nhất là " + min);
    }
}
