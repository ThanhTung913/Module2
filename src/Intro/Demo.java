package Intro;

import java.util.Date;

public class Demo {
    public static void main (String[] args) {
        System.out.println("chuyển độ C sang độ F");
        System.out.println((9 / 5) * 35 + 32);
        main2();
        main1();
        swichCase();
        date();
    }


    public static void main1 () {
        double PI = 3.14159;
        int y = 1;
        double raidus = 1.0;
        float x = 5 * (3 / 2);
        x = y + 1;
        double area = raidus * raidus * PI;
        System.out.println(area);
    }

    public static void main2() {
        float PI = 3.14159f ;
        int radius = 2;
        float area;
        if (radius >= 0){
            area = radius * radius * PI;
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }
    }

    public static void main3() {
        int i = 0;

        if (i > 0 )
            System.out.println("Dung oc cho");
        else
            System.out.println("tung that deo trai");


    }

    public static void swichCase() {
        int status = 0;
        switch ( status ){
            case 0:
                System.out.println("compute tax for single filter");
                break;
            case 1: System.out.println("compute tax for married jointly or qualifying window (er)");
            default:
                System.out.println("Error: in valid status");
                System.exit(1);
        }
    }


    public static void date() {
        Date now = new Date();
        System.out.println("Now is: " + now);
    }
}



