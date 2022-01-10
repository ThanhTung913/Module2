package ArrayAndFunction;

public class SapXepabc {
    public static void main(String[] args) {
        abc();
//        Sắp xếp theo chiều a - > z
        cba();
//        Sắp xếp theo chiều z - > a
    }

    public static void abc() {
        int[] a = {1,9,3,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
    }

    public static void cba() {
        int[] a = {1,9,3,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] < a[j]){
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
    }
}
