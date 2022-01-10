package Intro;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số Dolla");
        double dolla = scanner.nextInt();
        double rate = dolla * 23000;
        System.out.println("Số tiền VND được chuyển đổi là: " + rate);


    }
}
