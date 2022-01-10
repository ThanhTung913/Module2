package ArrayAndFunction;

public class AddIndex {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int addIndex = 5;
        int value = 77;
        int n = 5;
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Trước khi chèn");
        for ( int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = n; i > addIndex; i--){
            arr[i] = arr[i-1];
        }
        arr[addIndex] = value;
        System.out.println("Sau khi chèn");
        for ( int x: arr){
            System.out.print(x + " ");

        }
        System.out.println();
    }
}