package com.quan;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = -1;
        boolean isValidNumber;
        do {
            isValidNumber = true;
            System.out.println("Nhập số:");
            String n = scanner.nextLine();
            try {
                i = Integer.parseInt(n);
            }catch (NumberFormatException e){
                System.err.println("Yêu cầu nhập số");
                isValidNumber = false;
            }
        }while (!isValidNumber);
        System.out.println(i);
    }

    public static void writeToFile() throws IOException {
        throw new IOException();
    }
}
