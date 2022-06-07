package Introduction_to_Java;

import java.util.Scanner;

public class Introduction_to_Java3 {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng :");
        width = sc.nextFloat();
        System.out.println("Nhập vào chiều dài :");
        height = sc.nextFloat();
        float area = width * height;
        System.out.println("Diện tích hình chữ nhật là : " + area);
    }
}
