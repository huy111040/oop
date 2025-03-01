package oop.src;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListDouble {
    static ArrayList<Double> a = new ArrayList<>();

    public static void main(String[] args) {
        nhap();
        tong();
        in();
    }

    private static void nhap() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("nhap so (enter = ket thuc): ");
            String s = scanner.nextLine();
            if (s.isEmpty()) break;

            double n = Double.parseDouble(scanner.nextLine());
            a.add(n);

        }
    }

    private static void tong() {
//        double s1 = 0;
//
//        System.out.println("tong theo cach 1: " + s1);
//
//        for (int i = 0; i < a.size(); i++) {
//            s1 += a.get(i);//ko dung a[i]
//        }
        double s2 = 0;
        for (Double x : a) {
            s2 += x;
        }
        System.out.println("tong theo cach 2: " + s2);
    }

    private static void in() {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(" "+ a.get(i));//ko dung a[i]
        }
        System.out.println();
        for (Double x : a) {
            System.out.println(" "+x);
        }
        System.out.println();
    }
}
