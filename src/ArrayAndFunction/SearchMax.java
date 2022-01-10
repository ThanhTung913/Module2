package ArrayAndFunction;

import java.util.Scanner;

public class SearchMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các giá trị mà bạn muốn vào đi rồi mình tìm cái nào lớn nhất cho nhé!!");
        int[] arr = new int[10];
        int max = 0;
        for (int i = 0; i < 10; i++){
            arr[i] = scanner.nextInt();
            if(i == 0){
                max = arr[i];
            } else if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là " + max );
    }
}
