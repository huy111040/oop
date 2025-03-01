package oop.src;

import java.util.Scanner;

public class HinhChuNhat {
    Integer dai, rong, chuVi, dienTich;
    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        dai = scanner.nextInt();
        System.out.println("Nhap chieu rong: ");
        rong = scanner.nextInt();
    }
    Integer chuVi(){
        chuVi = (dai+rong)*2;
        return chuVi;
    }
    Integer dienTich(){
        dienTich= dai*rong;
        return dienTich;
    }
    void xuat(){
        System.out.println("chieu dai: "+ dai+" chieu rong: "+ rong+ " chu vi: "+ chuVi()+" dien tich: "+ dienTich());
    }

    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        HinhChuNhat hcn2 = new HinhChuNhat();
        hcn1.nhap();
        hcn2.nhap();
        hcn1.xuat();
        hcn2.xuat();
        if (hcn1.dienTich()>hcn2.dienTich()){
           System.out.println("hcn1 co s lon hon");
        }else {
            System.out.println("hcn2 co s lon hon");
        }
    }
}
