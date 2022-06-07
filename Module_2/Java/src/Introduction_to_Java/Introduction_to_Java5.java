package Introduction_to_Java;

import java.util.Scanner;

public class Introduction_to_Java5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Xin mời bạn nhập tháng muốn tính số ngày :");
        int month = sc.nextInt();
        switch (month) {
            case 2:
                System.out.print("Tháng 2 có 28 hoặc 29");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Tháng " + month + "có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Tháng " + month + "có 30 ngày");
                break;
            default:
                System.out.print("Tháng bạn nhập không hợp lệ");
                break;
        }
    }
}
