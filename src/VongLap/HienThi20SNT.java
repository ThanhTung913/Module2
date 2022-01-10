package VongLap;

import java.util.Scanner;

public class HienThi20SNT {
    public static void main(String[] args) {
        display();
    }

    public static boolean snt(int n) {

        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố bạn muốn in ra:");
        int num = scanner.nextInt();
        int count = 0;
        for (int i =2; count <= num; i++){
            if (snt(i)){
                System.out.print(" " + i);
                count++;
            }
        }
    }
}