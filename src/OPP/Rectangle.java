package OPP;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        HCN hcn = new HCN();
        double area = hcn.setArea(5.0, 3.0);
        double perimeter = hcn.setPerimeter(5.0,4.0);
        System.out.println(" Chu vi hình chữ nhật là : " + area);
        System.out.println("Diện tích hình chữ nhật là: " + perimeter);
    }
}

class HCN{
    private double width;
    private double height;

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

   public double setArea(double Width, double height){
        return (width + height) *2;
   }
    public double setPerimeter(double width, double height){
        return (width * height);
    }
}
