package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        try {
            bankAccount.Deposit(20000);
        } catch (LimitException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                System.out.print("Напишите сумму вывода: ");
                bankAccount.withDraw(scanner.nextInt());
                
            }catch (LimitException limitException){
                System.out.println(limitException.getMessage());
                try {
                    bankAccount.withDraw((int) limitException.getRemainingAmmount());
                } catch (LimitException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}