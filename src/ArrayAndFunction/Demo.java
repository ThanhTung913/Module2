package ArrayAndFunction;

public class Demo {
    public static void main(String[] args) {
        double[] mylist = {1, 2, 3, 3, 23, 2};
//        for (int i = 0; i < mylist.length; i++) {
//            System.out.println(mylist[i]);
//        }
        for (double item: mylist){
            System.out.println(item);
//           <== for each : duyệt qua tất cả các phần tử trong mảng
        }
    }
}
