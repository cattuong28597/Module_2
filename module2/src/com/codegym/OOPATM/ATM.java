package com.codegym.OOPATM;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ATM {
    private long account = 1200000;
    String[] history = new String[3];
    Scanner input = new Scanner(System.in);

    public ATM() {
    }

    public ATM(long account) {
        this.account = account;
    }

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
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
        String addMoney = input.nextLine();
        while(addMoney.matches("[0-9]+") == false || addMoney.length()<4 || (addMoney.length()>=4 && Long.valueOf(addMoney)%1000!=0)){
            System.out.println("Xin ban vui long nhap lai so tien hop le");
            System.out.print("Vui long nhap so tien ");
            addMoney = input.nextLine();
        }
        long money = Long.valueOf(addMoney);
        account = account + money;
        System.out.println("Giao dich thanh cong. Ban vua nap " + formatter.format(money) + " vnd thanh cong.");
        System.out.println("So du tai khoan cua khach hang la: " + formatter.format(account) + " vnd");
        System.out.println("Bam nut theo menu de tiep tuc giao dich");
        System.out.println("=================================================");
        for (int i = 0; i < 2; i++) {
            this.history[i] = this.history[i + 1];
        }
        this.history[2] = ("Nap tien " + formatter.format(money) + " vnd");
    }

    public void withdrawalMoney() {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        String subtractMoney;
        System.out.println("Giao dich Rut tien");
        System.out.print("Vui long nhap so tien ");
        subtractMoney = input.nextLine();
        while (subtractMoney.matches("[0-9]+") == false || subtractMoney.length() < 4 || Long.valueOf(subtractMoney) % 1000 != 0) {
            System.out.println("So tien khong hop le");
            System.out.print("Vui long nhap lai so tien: ");
            subtractMoney = input.nextLine();
        }
        long smoney = Long.valueOf(subtractMoney);
        if (smoney <= account) {
            account -= smoney;
            System.out.println("Giao dich thanh cong.");
            System.out.println("Ban vua rut " + formatter.format(smoney) + " vnd thanh cong.");
            System.out.println("So du tai khoan khach hang la: " + formatter.format(account) + " vnd");
            System.out.println("Bam nut theo menu de tiep tuc giao dich");
            System.out.println("=================================================");
            for (int i = 0; i < 2; i++) {
                this.history[i] = this.history[i + 1];
            }
            this.history[2] = ("Rut tien " + formatter.format(smoney) + " vnd");
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
