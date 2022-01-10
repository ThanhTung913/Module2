package VongLap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin mời bạn chọn hình mình muốn vẽ");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("++ 1. Vẽ hình chữ  nhật             ++");
        System.out.println("++ 2. vẽ hình vuông                 ++");
        System.out.println("++ 3. Vẽ hình tam giác              ++");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        int num = scanner.nextInt();
        if (num <= 3){
            switch (num){
                case 1:
                    System.out.println("++++++++++++++++++++++++++++++++++++++");
                    System.out.println("++++++++++++++++++++++++++++++++++++++");
                    System.out.println("++++++++++++++++++++++++++++++++++++++");
                    System.out.println("++++++++++++++++++++++++++++++++++++++");
                    System.out.println("++++++++++++++++++++++++++++++++++++++");
                    System.out.println("++++++++++++++++++++++++++++++++++++++");
                    System.out.println("++++++++++++++++++++++++++++++++++++++");
                    break;
                case 2:
                    System.out.println("++++++++++++++++++++");
                    System.out.println("++++++++++++++++++++");
                    System.out.println("++++++++++++++++++++");
                    System.out.println("++++++++++++++++++++");
                    System.out.println("++++++++++++++++++++");
                    System.out.println("++++++++++++++++++++");
                    System.out.println("++++++++++++++++++++");

                    break;
                case 3:
                    System.out.println("        +       ");
                    System.out.println("       +++");
                    System.out.println("      +++++");
                    System.out.println("     +++++++");
                    System.out.println("    +++++++++");
                    System.out.println("   +++++++++++");
                    break;
                default:
                    System.out.println("Nhập sai cú pháp, xin mời bạn nhập lại!!!");
            }
        }
    }
}
