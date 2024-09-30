package com.mycompany.bttuan3;
import java.util.Scanner;

public class TruongNhatjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.println("Chon phep tinh:");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");      
        System.out.print("Nhap lua chon (1-4): ");
        int choice = scanner.nextInt();      
        System.out.print("Nhap so thu nhat: ");
        double num1 = scanner.nextDouble();      
        System.out.print("Nhap so thu hai: ");
        double num2 = scanner.nextDouble();     
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Ket qua: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Ket qua: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Ket qua: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Ket qua: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Loi! Khong the chia cho 0.");
                }
                break;
            default:
                System.out.println("Lua chon khong hop le.");
        }
    }
}

