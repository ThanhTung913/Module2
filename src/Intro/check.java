package Intro;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int count = 0;
//        System.out.println("Nhập vào số muốn kiểm tra");
//        int number = scanner.nextInt();
//        for (int i = 2; i < (number ); i++ ) {
//            if (number % i == 0) {
//                count++;
//            }
//        }
//        if (count == 2){
//            System.out.println("Đây là không phải số nguyên tố");
//        } else {
//                System.out.println("Đây là số nguyên tố");
//        }
        System.out.println("Nhập số nguyên tố vào");
        int number = scanner.nextInt();
        int j=0;
        for (int i = 2; i < number - 1; i++ ){
            if (number % i == 0){
                 j = -1;
                 break;
            } else {
                j =0;
            }
        } if ( j == -1 ) {
            System.out.println("Đây không phải là số nguyên tố");
        } else {
            System.out.println("đây là số nguyên tố");
        }
    }

}
