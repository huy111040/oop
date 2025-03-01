package oop.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> hoTen = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            System.out.println("1. Nhập họ tên sinh viên");
            System.out.println("2. In hoa SV có họ Nguyễn hoặc tên Tuấn");
            System.out.println("3. In hoa họ tên SV có họ lót Mỹ");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            int n;
            try {
                n = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
                continue;
            }

            switch (n) {
                case 1:
                    nhapHoTen();
                    break;
                case 2:
                    inSVhoNguyenOrTenTuan();
                    break;
                case 3:
                    inHoLotMy();
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc.");
                    return;
                default:
                    System.out.println("Nhập lựa chọn đúng!");
            }
        }
    }

    private static void nhapHoTen() {
        while (true) {
            System.out.print("Nhập họ tên sinh viên (Enter để kết thúc): ");
            String ten = scanner.nextLine().trim();
            if (ten.isEmpty()) break;
            hoTen.add(ten);
        }
    }

    private static void inSVhoNguyenOrTenTuan() {
        System.out.println("Sinh viên có họ Nguyễn hoặc tên Tuấn:");
        for (String name : hoTen) {
            String[] parts = name.split(" ");
            if (parts.length > 0) {
                String lastName = parts[0];
                String firstName = parts[parts.length - 1];
                if (lastName.toLowerCase().equalsIgnoreCase("nguyen") || firstName.toLowerCase().equalsIgnoreCase("tuan")) {
                    System.out.println(name.toUpperCase());
                }
            }
        }
    }

    private static void inHoLotMy() {
        System.out.println("Sinh viên có họ lót Mỹ:");
        for (String name : hoTen) {
            String[] parts = name.split(" ");
            for (int i = 1; i < parts.length - 1; i++) {
                if (parts[i].toLowerCase().equalsIgnoreCase("my")) {
                    System.out.println(name.toUpperCase());
                    break;
                }
            }
        }
    }
}