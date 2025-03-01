package oop.src;

import java.util.Scanner;

public class SinhVien {
    String hoTen;
    Double diem;
    Scanner scanner = new Scanner(System.in);
     void nhap(){
        System.out.println("Nhap ten sinh vien: "  );
        hoTen = scanner.nextLine();
        System.out.println("Nhap diem sinh vien: ");
        diem= Double.parseDouble(scanner.nextLine());
    }
     void xuat() {
        System.out.println("Tên: " + hoTen + ", Điểm: " + diem + ", Xếp loại: " + xepLoai());
    }

     String xepLoai() {
        if (diem >= 8.5) {
            return "Giỏi";
        } else if (diem >= 7.0) {
            return "Khá";
        } else if (diem >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.xuat();
    }
}
