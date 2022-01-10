package Intro;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
//        Scanner sc = new  Scanner(System.in);
//        System.out.println("May hay cho tao 1 con so tao se noi cho may biet 1 bi mat");
//        int month = sc.nextInt();
//        String dayInMonth = " ";
//        switch (month){
//            case 2:
//                System.out.println("Thang nay co 28 hoac 29 ngay nhe");
//                break;
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                dayInMonth = "31";
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                dayInMonth = "30";
//                break;
//
//            default:
//                dayInMonth="";
//                break;
//
//            }
//            if (dayInMonth != ""){
//                System.out.println("So ngay trong " + month + " la" + dayInMonth + "ngay");
//        }
        DayinMonth();
    }

    public static void DayinMonth() {
        Scanner day = new Scanner(System.in);
                int month = day.nextInt();
        String dayInMonth = "";
        switch (month){
            case 2:
                System.out.println("Thang nay co 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth =" 31 ngay";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30 ngay";
                break;
            default:
                dayInMonth ="Khong co thang nay" ;
                break;

        }
        System.out.println("thang " + month + " co " + dayInMonth);
    }
}
