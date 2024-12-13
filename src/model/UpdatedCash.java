package model;

/* class UpdatedCash adalah pembaruan dari class Cash, disini kita menambahkan pajak */
public class UpdatedCash implements PaymentMethod {
  private double balance;

  public UpdatedCash(double balance) {
      if (balance < 1000) {
          throw new IllegalArgumentException("Balance must be at least 1000");
      }
      this.balance = balance - 1000; // Menaambahkan Pajak 1000
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