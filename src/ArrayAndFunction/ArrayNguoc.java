package ArrayAndFunction;

import java.util.Scanner;

public class ArrayNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập giá trị mà bạn muốn đảo ngược");
        int a[] = new int[10];
        for (int i =0; i < a.length; i++){
            a[i] = scanner.nextInt();
            System.out.print("Giá trị" + (i + 1) + ":");
        }
        for ( int i = (a.length -1); i>=0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
