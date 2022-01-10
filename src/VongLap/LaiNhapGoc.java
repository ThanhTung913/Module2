package VongLap;

import java.util.Scanner;

public class LaiNhapGoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền và số tháng bạn muốn gửi");
        double money = scanner.nextInt();
        System.out.println("Số tháng muốn gửi");
        int month = scanner.nextInt();
        System.out.println("Lãi suất 1 tháng");
        double r = scanner.nextInt();
        double R =0;
        for (int i = 0; i < month; i++) {
            R = money * r/100;
            money = money + R;
        }
        System.out.println(money);
    }
}
