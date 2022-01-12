package ArrayAndFunction;

import java.util.Scanner;

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

    public static class StaticMethod {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String chuoi;
            char kyTu = 'a';
            int count = 0;


            System.out.println("Nhập vào chuỗi bất kỳ: ");
            chuoi = scanner.nextLine();

            // duyệt từ đầu đến cuối chuỗi
            for (int i = 0; i < chuoi.length(); i++) {
                // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
                if (chuoi.charAt(i) == kyTu) {
                    count++;
                }
            }
            System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                    " trong chuỗi " + chuoi + " = " + count);
        }

    }
}