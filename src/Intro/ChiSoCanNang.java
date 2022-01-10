package Intro;

import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        Scanner body = new Scanner(System.in);
        System.out.println("Xin mời nhập cân nặng của bạn ");
        double weidth = body.nextDouble();
        System.out.println("Xin mời nhập chiều cao của bạn ");
        double height = body.nextDouble();
        double bmi = weidth / (height*height);
        if (bmi < 18.5){
            System.out.println("Bạn được phân loại là Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0){
            System.out.println("Bạn được phân loại là Nomal");
        } else if (bmi >= 25.0 && bmi < 30.0){
            System.out.println("Bạn được phân loại là Overweight");
        } else {
            System.out.println("Bạn béo phì cmnr");
        }

    }
}
