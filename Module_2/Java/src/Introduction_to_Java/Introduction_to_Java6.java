package Introduction_to_Java;

import java.util.Scanner;

public class Introduction_to_Java6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Mời nhập năm : ");
        year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("Năm %d là Năm Nhuận", year);
                } else {
                    System.out.printf("Năm %d KHÔNG PHẢI là Năm Nhuận", year);
                }
            } else {
                System.out.printf("Năm %d là Năm Nhuận", year);
            }
        } else {
            System.out.printf("Năm %d KHÔNG PHẢI là Năm Nhuận", year);
        }
    }
}
