package model;

@Deprecated
public class Cash implements PaymentMethod {
    private double balance;

    public Cash(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean processPayment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Pembayaran $%.2f berhasil menggunakan tunai.\n", amount);
            return true;
        } else {
            System.out.println("Uang tunai tidak cukup.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}
