package ArrayAndFunction;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        int number = -1;

//if ( number >= 0 && number < 3){
//
//}
        do {
            System.out.println("Xin mời bạn nhập một số để chọn chương trình");
            Scanner scanner = new Scanner(System.in);
            System.out.println(" 1. Fahrenheit to Celsius");
            System.out.println(" 2 .Celsius to Fahrenheit");
            System.out.println(" 0. exit");
            System.out.print("Nhập vào: ");
            number = Integer.parseInt(scanner.nextLine());

            switch (number){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Nhập nhiệt độ mà bạn muốn chuyển đổi vào");
                    double cels = Double.parseDouble(scanner.nextLine());
                    fahren(cels);
                    System.out.println(fahren(cels));
                    break;
                case 2:
                    System.out.println("Nhập nhiệt độ mà bạn muốn chuyển đổi vào");
                    double fah = Double.parseDouble(scanner.nextLine());
                    celsius(fah);
                    System.out.println(celsius(fah));
                    break;
            }
        } while (number != 1 && number != 2);

}

    public static double celsius(double fah){
        double c = (5.0 / 9) * (fah - 32);
        return c;
    }

    public static double fahren(double cel){
        double f = (9.0/5) * cel + 32;
        return f;
    }
}
