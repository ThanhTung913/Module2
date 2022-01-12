package OOP;

public class ClassFan {
    static final int SLOW = 1;
    static final int MeDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false; //mặc định tắt
    private double radius = 5;
    private String color = "blue";

    public ClassFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMeDIUM() {
        return MeDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ClassFan{" +
                "SLOW=" + SLOW +
                ", MeDIUM=" + MeDIUM +
                ", FAST=" + FAST +
                ", speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan(ClassFan.FAST,true,10, "yellow" );
        System.out.println(fan1);
        ClassFan fan2 = new ClassFan(ClassFan.MeDIUM, false,5,"Blue");
        System.out.println(fan2);
    }
}
