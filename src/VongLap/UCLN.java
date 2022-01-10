package VongLap;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 2 số bạn cần kiểm tra vào");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double result = 0;
        for (int i = 1; i < a && i < b; i++){
            if (a % i == 0 && b % i ==0){
                result = i;
            }
        }System.out.println(result);
    }
}
