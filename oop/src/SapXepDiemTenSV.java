package oop.src;

import java.util.Scanner;

public class SapXepDiemTenSV {
    static double diem[] = new double[100];
    static String ten[] = new String[100];
    static int n;

    public static void main(String[] args) {
        nhap();
        sapXep();
        in();
    }

    private static void sapXep() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] < diem[j]) {
                    double temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;

                    String t = ten[i];
                    ten[i] = ten[j];
                    ten[j] = t;

                }
            }

        }
    }

    private static void in() {
        for (int i = 0; i < n; i++) {
            System.out.println("Tên: "+ ten[i]+ " Điểm: "+diem[i]);
        }
    }

    private static void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhap so luong sinh vien n = ");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten sinh vien: ");
            ten[i] = sc.nextLine();

            System.out.println("Nhap diem sinh vien:   ");
            diem[i] = Double.parseDouble(sc.nextLine());
        }
    }
}
