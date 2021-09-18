package com.codegym.OOPATM;

import java.util.Scanner;
import java.text.DecimalFormat;

public class main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        String choice = "B";
        Scanner input = new Scanner(System.in);
        System.out.println("Ngan hang ABC kinh chao Quy khach Nguyen Van A");
        do {
            System.out.println("Menu:");
            System.out.println("   1. Nhan phim A de kiem tra tai khoan");
            System.out.println("   2. Nhan phim D de nap tien");
            System.out.println("   3. Nhan phim W de rut tien");
            System.out.println("   4. Nhan phim H de xem lich su 3 lan");
            System.out.println("   5. Nham phim X de thoat");
            System.out.println("=================================================");
            System.out.print("Nhap lua chon cua ban: ");
            choice = input.nextLine();

            switch (choice) {
                case "A":
                case "a":
                    atm.displayAccount();
                    break;
                case "D":
                case "d":
                    atm.depositMoney();
                    break;
                case "W":
                case "w":
                    atm.withdrawalMoney();
                    break;
                case "H":
                case "h":
                    atm.historyAccount();
                    break;
                case "X":
                case "x":
                    atm.exitAccount();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban nhap sai chuc nang");
                    System.out.println("Bam nut theo menu de tiep tuc giao dich");
                    System.out.println("=================================================");
            }
        } while ((choice != "X") && (choice != "x"));
    }
}
