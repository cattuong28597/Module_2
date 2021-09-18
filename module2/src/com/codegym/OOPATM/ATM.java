package com.codegym.OOPATM;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ATM {
    private int account = 1200000;
    String[] history = new String[3];
    Scanner input = new Scanner(System.in);

    public ATM() {
    }

    public ATM(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void displayAccount() {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        System.out.println("So du tai khoan khach hang la: " + formatter.format(account) + " vnd");
        System.out.println("Bam nut theo menu de tiep tuc giao dich");
        System.out.println("=================================================");
        for (int i = 0; i < 2; i++) {
            this.history[i] = this.history[i + 1];
        }
        this.history[2] = "Kiem tra tai khoan";
    }

    public void depositMoney() {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        System.out.println("Giao dich Nap tien");
        System.out.print("Vui long nhap so tien ");
        int addMoney = input.nextInt();
        account = account + addMoney;
        System.out.println("Giao dich thanh cong. Ban vua nap " + formatter.format(addMoney) + " vnd thanh cong.");
        System.out.println("So du tai khoan cua khach hang la: " + formatter.format(account) + " vnd");
        System.out.println("Bam nut theo menu de tiep tuc giao dich");
        System.out.println("=================================================");
        for (int i = 0; i < 2; i++) {
            this.history[i] = this.history[i + 1];
        }
        this.history[2] = ("Nap tien " + formatter.format(addMoney) + " vnd");
    }

    public void withdrawalMoney() {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        int subtractMoney;
        System.out.println("Giao dich Rut tien");
        System.out.print("Vui long nhap so tien ");
        subtractMoney = input.nextInt();
        if (subtractMoney <= account) {
            account -= subtractMoney;
            System.out.println("Giao dich thanh cong.");
            System.out.println("Ban vua rut " + formatter.format(subtractMoney) + " vnd thanh cong.");
            System.out.println("So du tai khoan khach hang la: " + formatter.format(account) + " vnd");
            System.out.println("Bam nut theo menu de tiep tuc giao dich");
            System.out.println("=================================================");
            for (int i = 0; i < 2; i++) {
                this.history[i] = this.history[i + 1];
            }
            this.history[2] = ("Rut tien " + formatter.format(subtractMoney) + " vnd");
        } else {
            System.out.println("Giao dich khong thanh cong");
            System.out.println("So du tai khoan khach hang la: " + formatter.format(account) + " vnd");
            System.out.println("Ban khong the rut so tien hon so du tai khoan");
            System.out.println("Bam nut theo menu de tiep tuc giao dich");
            System.out.println("=================================================");
            for (int i = 0; i < 2; i++) {
                this.history[i] = this.history[i + 1];
            }
            this.history[2] = ("Rut tien khong thanh cong");
        }
    }

    public void historyAccount() {
        System.out.println("Lich su giao dich:");
        for (int i = 0; i < history.length; i++) {
            System.out.println(this.history[i]);
        }
        System.out.println("Bam nut theo menu de tiep tuc giao dich");
        System.out.println("=================================================");
    }

    public void exitAccount() {
        System.out.println("Cam on ban da su dung dich vu ATM");
    }
}
