package oop.src;

import java.util.Scanner;

public class NhapNhanVien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String rgmaNV = "[A-Z]{5}",
                rgmatKhau = ".{6,}",
                rghovaTen = "[a-zA-Z  ]+",
                rgemail = "\\w+@\\w+(\\. \\w+){1,2}",
                rgsdt = " 083\\d{7}",
                rgsoXeMay = " 5\\d-[A-Z]-((\\d{4})|(\\d{3}\\.{2}))",
                rgcmnd = "\\d{10}";
        String maNV, matKhau;

        while (true) {
            System.out.println("nhap ma nhan vien 5 ky tu in hoa");
            maNV = in.nextLine();
            if (maNV.matches(rgmaNV)) {
                break;
            } else {
                System.out.println("nhap lai");
            }
        }
        while (true) {
            System.out.println("Nhap matkhau 6 ky tu");
            matKhau = in.nextLine();
            if (matKhau.matches(rgmatKhau)) {
                break;
            } else {
                System.out.println("nhap lai");
            }
        }
    }
}
