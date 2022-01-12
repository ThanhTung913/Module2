package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double geta() {
        return this.a;
    }
    public double getb() {
        return this.b;
    }
    public double getc() {
        return this.c;
    }
    public double getDiscriminant(){
        double delta = b*b - 4 * a*c;
        return delta;
    }
    public double getRoot1(){
        double r1 =(-b + (Math.pow((b*b -4*a*c),0.5))/2*a);
        return r1;
    }
    public double getRoot2(){
        double r2 =(-b - (Math.pow((b*b -4*a*c),0.5))/2*a);
        return r2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() > 0 ){
            System.out.println("Phương trình có 2 nghiệm là: " + quadraticEquation.getRoot1() + " " +  quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("Phương trình có 1 nghiệm kép là :" + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
