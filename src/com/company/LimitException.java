package com.company;

public class LimitException extends Exception {

    public double getRemainingAmmount() {
        return remainingAmmount;
    }

    public void setRemainingAmmount(double remainingAmmount) {
        this.remainingAmmount = remainingAmmount;
    }

    public LimitException(String message, double remainingAmmount) {
        super(message);
        this.remainingAmmount = remainingAmmount;
    }

    private double remainingAmmount;
}