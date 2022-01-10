package ArrayAndFunction;

import java.util.Scanner;

public class SearchValue {
    public static void main(String[] args) {
        String[] number = {"le","nguyen","phan","ho","tran"};
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        boolean X = false;
        for (int  i = 0; i < number.length; i++){
            if(number[i].equals(search)){
                System.out.println("Chữ mà bạn muốn tìm có trong mảng" + search + "nằm ở vị trí " + i);
                X = true;
                break;
            }
        }
        if(!X){
            System.out.println("không tìm thấy " + search + " trong mảng");
        }
    }
}
