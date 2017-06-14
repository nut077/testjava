package com.nut.test;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        System.out.println(bankAccount.getAccoutnBalance());
        bankAccount.calculateInterest(5);
        System.out.println(bankAccount.getAccoutnBalance());
        bankAccount.calculateInterest(5);
        System.out.println(bankAccount.getAccoutnBalance());
    }
}

class BankAccount {
    private double accoutnBalance;

    public BankAccount(double accoutnBalance) {
        this.accoutnBalance = accoutnBalance;
    }

    public double getAccoutnBalance() {
        return accoutnBalance;
    }

    public void calculateInterest(double interestRate) {
        Interest interest = new Interest(interestRate);
        interest.changeAccountBalance();
    }

    class Interest {
        private double interestRate;

        public Interest(double interestRate) {
            this.interestRate = interestRate;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void changeAccountBalance() {
            double interest = (accoutnBalance * interestRate) / 100;
            accoutnBalance += interest;
        }
    }
}

