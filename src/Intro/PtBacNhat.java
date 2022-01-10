package Intro;

import java.util.Scanner;

public class PtBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equantion á ' a * x + = 0 ', Please enter constant:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if ( a != 0 ){
            double ansewr = (c - b )/a;
            System.out.printf("Equantion pass with x = %f!\n", ansewr);
        } else {
            if ( b == 0){
                System.out.println("The soltion is all x!");
            } else {
                System.out.println("No Solution!");
            }
        }
        PTBN();
    }

    public static void PTBN() {
        System.out.println("Pt bac nhat co dang a X + b = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        if (a!= 0){
            double c = - b / a;
            System.out.println("Pt co nghiem la: " + c);
        } else if (a == 0 && b==0 ){
            System.out.println("Phuong trinh co vo so nghiem");
        } else {
            System.out.println("phuong trinh vo nghiem");
        }
    }
}
