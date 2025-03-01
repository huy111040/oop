package oop.src;

import java.util.Scanner;

public class Diem {
    double x, y;
    void nhapToaDo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tọa độ x: ");
        x = scanner.nextDouble();
        System.out.print("Nhập tọa độ y: ");
        y = scanner.nextDouble();
    }
    void xuatToaDo() {
        System.out.println("(" + x + ", " + y + ")");
    }
    static double getKhoangCach(Diem A, Diem B) {
        return Math.sqrt(Math.pow(A.x - B.x, 2) + Math.pow(A.y - B.y, 2));
    }

    public static void main(String[] args) {
        Diem A = new Diem();
        Diem B = new Diem();

        System.out.println("Nhập điểm A:");
        A.nhapToaDo();

        System.out.println("Nhập điểm B:");
        B.nhapToaDo();

        System.out.print("Tọa độ điểm A: ");
        A.xuatToaDo();

        System.out.print("Tọa độ điểm B: ");
        B.xuatToaDo();

        System.out.println("Khoảng cách từ A đến B: " + getKhoangCach(A,B));
    }

}
