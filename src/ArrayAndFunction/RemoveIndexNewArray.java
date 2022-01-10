package ArrayAndFunction;

import java.util.Scanner;

public class RemoveIndexNewArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = 5;
        int remove = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        System.out.println(" Trước khi xóa");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        for (int i = remove; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Sau khi xóa");
        for (int x : arr) {
            System.out.print(x + " ");
        }
//    public static boolean Remove() {
//        Scanner scanner = new Scanner(System.in);
//        String[] arr = {"tung", " dung" , "phuong", "tuan"," truong", "cu"};
//        String input = scanner.nextLine();
//        for ( int i = 0; i < arr.length; i++){
//            if ( arr[i].equals(input)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void X(String arr) {
//        if (Remove() == true){
//            System.out.println(arr[i]);
//        }
    }
}
