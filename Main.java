package com.company;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean active = true;
        while (active == true) {
            System.out.println("Данная программа открывает новое окно хрома");
            System.out.println("И ничего больше она не может");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите yes для подтверждения:");
            String ans = scanner.nextLine();
            System.out.println(ans);
            if ("yes".equals(ans)) {
                try {
                    String comm = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
                    Process p = Runtime.getRuntime().exec(comm);
                    active=false;
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("Введите что-нибудь ещё");
            }
        }
    }
}
