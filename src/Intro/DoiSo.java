package Intro;

import java.util.Scanner;

public class DoiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = "";
        if (number > 0 && number < 10) {
            result = unit(number);
            System.out.println(result);
            return;
        }
        if (number < 20) {

            result = lestwenty(number);
            System.out.println(result);
            return;
        }
        if (number < 100) {
            int denzo = number / 10;
            int unit = number % 10;
            result = denzo(denzo) + " " + unit(unit);
            System.out.println(result);
            return;
        }

        if (number < 1000) {
            int hundred = number / 100;
            int denzo = number % 100;
            int unit = number % 10;
            int lestwenty;
           if (denzo < 20){
               result = hundred(hundred) + " " + lestwenty(denzo);
           }
           else {
               result = lessThousand(hundred,denzo / 10, unit);
               System.out.println(result);
               return;
            }
         }
    }

    public static String lessThousand(int hundred, int denzo, int unit){
    return hundred(hundred) + " and " + denzo(denzo) + unit(unit);
    }

    public static String hundred(int hundred) {
        String result = unit(hundred) + "hundred";
        return result;
    }

    public static String denzo(int denzo) {
        String result = "";
        switch (denzo) {
            case 0:
                result = "";
                break;
            case 2:
                result = "twenty";
                break;
            case 3:
                result = "thirty";
                break;
            case 4:
                result = "forty";
                break;
            case 5:
                result = "fifty";
                break;
            case 6:
                result = "sixty";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eighty";
                break;
            case 9:
                result = "ninety";
                break;
        }
        return result;
    }

    public static String lestwenty(int number) {
        String result = "";
        switch (number) {
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleve";
                break;
            case 12:
                result = "twelve";
                break;
            case 13:
                result = "thirteen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
            case 16:
                result = "sixteen";
                break;
            case 17:
                result = "seventeen";
                break;
            case 18:
                result = "eighteen";
                break;
            case 19:
                result = "nineteen";
                break;
        }
        return result;
    }

    public static String unit(int unit) {
        String result = "";
        switch (unit) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
        }
        return result;
    }
}
