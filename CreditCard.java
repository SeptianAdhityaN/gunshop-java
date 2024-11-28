public class CreditCard implements PaymentMethod {
    private String cardNumber;
    private double creditLimit;

    public CreditCard(String cardNumber, double creditLimit) {
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean processPayment(double amount) {
        if (creditLimit >= amount) {
            creditLimit -= amount;
            System.out.printf("Pembayaran $%.2f berhasil menggunakan kartu kredit (Kartu: %s).\n", amount, cardNumber);
            return true;
        } else {
            System.out.println("Kartu kredit mencapai batas kredit.");
            return false;
        }
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
