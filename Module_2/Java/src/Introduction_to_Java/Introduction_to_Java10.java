package Introduction_to_Java;

import java.util.Scanner;

public class Introduction_to_Java10 {
    public static void main(String[] args) {
    double vnd = 23000;
    double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Số USD muốn quy đổi :");
        usd = sc.nextDouble();
        double total = vnd * usd;
        System.out.print("Thành tiền VND sau khi đổi là : " + total);
    }
}
