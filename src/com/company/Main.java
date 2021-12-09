package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.Deposit(20000);
        while (true){
            try {bankAccount.withDraw(6000);
            }catch (LimitException limitException){
                System.out.println(limitException.getMessage());
                bankAccount.withDraw((int) limitException.getRemainingAmmount());
                break;
            }
        }
    }
}