package Introduction_to_Java;

import java.util.Scanner;

public class Introduction_to_Java4 {
    public static void main(String[] args) {
        System.out.println("Giải Phương Trình Bậc Nhất");
        System.out.println("Đây là Phương Trình 'a * x + b = c', Vui Lòng Nhập Các Hằng Số: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        double a = sc.nextDouble();
        System.out.print("b :");
        double b = sc.nextDouble();
        System.out.print("c :");
        double c = sc.nextDouble();
        if (a!=0) {
            double answer = (c - b) / a;
            System.out.printf("Phương Trình Có Nghiệm x = %f!\\n", answer);
        } else  {
            if (b==c) {
                System.out.print("Có Vô Số Nghiệm x!");
            } else {
                System.out.print("Phương Trình Vô Nghiệm!");
            }
        }
    }
}
