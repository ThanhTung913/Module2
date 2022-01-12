package AccentModifier;

public class StaticMethod {
    private int id;
    private String name;
    private static String collect = "DBRR";

    StaticMethod(int a, String b){
        id = a;
        name = b;
    }

     static void change(){
        collect = "CodeGym";
    }

    void disPlay(){
        System.out.println(id + " " + name + " " + collect);
    }

    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(25, "Tùng đẹp trai quá 1");
        StaticMethod s2 = new StaticMethod(10, "Tùng đẹp trai quá 2");
        StaticMethod s3 = new StaticMethod(99, "Tùng đẹp trai quá 3");

        s1.disPlay();
        s2.disPlay();
        s3.disPlay();

    }
}
