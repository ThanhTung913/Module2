package Intro;

import java.util.Scanner;

public class KtNamNhuan {
    public static void main(String[] args) {
        Scanner namNhuan = new Scanner(System.in);
        System.out.println(" Hãy nhập vào số năm mà bạn muốn kiểm tra");
        int year = namNhuan.nextInt();
        if (year % 100 == 0 && year % 400 == 0 ){
            System.out.println("Năm này là năm nhuận");
        } else if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Năm này là năm nhuận");
        } else {
            System.out.println("Năm này không phải là năm nhuận");
        }
    }
}
