package VongLap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin mời bạn chọn hình mình muốn vẽ");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("++ 1. Vẽ hình chữ  nhật             ++");
        System.out.println("++ 2. vẽ hình tam giác xuôi         ++");
        System.out.println("++ 3. Vẽ hình tam giác ngược        ++");
        System.out.println("++ 0. Exit                          ++");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        int num = scanner.nextInt();
        if(num <=3){
            switch (num){
                case 1:
                    System.out.println("Hãy nhập số hàng và số cột mà bạn muốn");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    for ( int i = 0; i <a; i++ ){
                        for ( int j = 0;j <b; j++ ){
                            System.out.print(" * " );
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Nhập chiều cao của hình tam giác mà bạn muốn (dòng)");
                    int h = scanner.nextInt();
                    for (int i =1; i <h+1; i++){
                        for ( int j =1; j<i; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Nhập chiều cao của hình tam giác mà bạn muốn (dòng)");
                    int g = scanner.nextInt();
                    for ( int i =g+1; i >= 1; i--){
                        for ( int j = 1; j <= i; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Nhập sai cú pháp xin mời bạn nhập lại");
                    }
            }
        }
    }



