package OPP;

public class DemoKhoiTao {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("Hình tròn có bán kính là:  " + circle1.radius + " và có diện tích là: "  + circle1.getArea());
        System.out.println("Hình tròn có bán kính là:  " + circle1.radius + " và có chu vi là: "  + circle1.getPerimeter());
        SimpleCircle circle2 = new SimpleCircle(2.5);
        System.out.println("Hình tròn có bán kính là:  " + circle2.radius + " và có diện tích là: "  + circle2.getArea());
        System.out.println("Hình tròn có bán kính là:  " + circle2.radius + " và có chu vi là: "  + circle2.getPerimeter());
        SimpleCircle circle3 = new SimpleCircle(5.0);
        System.out.println("Hình tròn có bán kính là:  " + circle3.radius + " và có diện tích là: "  + circle3.getArea());
        System.out.println("Hình tròn có bán kính là:  " + circle3.radius + " và có chu vi là: "  + circle3.getPerimeter());
    }
}

class SimpleCircle {
    double radius;

    SimpleCircle() {
        radius = 1;
        //    Khởi tạo thuộc tính radius
    }

    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }
}