package OOP;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){};
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getArea() {
        return (this.width + this.height) * 2;
    }

    public double getPerimeter() {
        return (this.width * this.height);
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(30,20);
        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();
        System.out.println(" Chu vi hình  nhật là : " + area);
        System.out.println("Diện tích hình chữ nhật là: " + perimeter);
    }
}

