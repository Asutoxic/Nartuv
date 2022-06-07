package Introduction_to_Java;

import java.util.Scanner;

public class Introduction_to_Java7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, BMI;
        System.out.print("Cân Nặng (kilogram) :");
        weight = sc.nextDouble();
        System.out.print("Chiều cao (Meter) :");
        height = sc.nextDouble();
        BMI = weight / Math.pow(height,2);
        System.out.printf("%-10s%s", "BMI", "Thể Trạng\n");
        if (BMI < 18)
            System.out.printf("%-10.2f%s", BMI, "Thiếu Cân");
        else if (BMI < 25.0)
            System.out.printf("%-10.2f%s", BMI, "Bình Thường");
        else if (BMI < 30.0)
            System.out.printf("%-10.2f%s", BMI, "Thừa Cân");
        else
            System.out.printf("%-10.2f%s", BMI, "Béo Phì");
    }
}
