package oop.src;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XuatSoChan {
    public static void main(String[] args) {
        nhapChuoi();
        xuatChuoi();

    }


    private static void xuatChuoi() {
        if (soChan.isEmpty()) {
            System.out.println("Không có số chẵn nào trong chuỗi đã nhập.");
        } else {
            System.out.println("Danh sách số chẵn được lưu trữ:");
            for (int so : soChan) {
                System.out.print(so + " ");
            }
            System.out.println();
        }

    }

    private static List<Integer> soChan = new ArrayList<>();

    private static void nhapChuoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi số, cách nhau bằng dấu phẩy: ");
        String input = scanner.nextLine();

        String[] daySo = input.split(",");
        System.out.println("Các số chẵn trong chuỗi:");
        for (String so : daySo) {
            int value = Integer.parseInt(so.trim());
            if (value % 2 == 0) {
                soChan.add(value);
                System.out.println(value);

            }
        }
    }
}
