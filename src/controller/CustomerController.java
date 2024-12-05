package controller;

import model.Weapon;
import model.PaymentMethod;
import java.util.ArrayList;

public class CustomerController {
    private final PaymentMethod paymentMethod;
    private double totalSpent = 0;
    private final ArrayList<Weapon> purchasedWeapons = new ArrayList<>();

    public CustomerController(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void buyWeapon(Weapon weapon) {
        if (weapon.getStock() > 0) {
            if (paymentMethod.processPayment(weapon.getPrice())) {
                weapon.reduceStock();
                totalSpent += weapon.getPrice();
                purchasedWeapons.add(weapon);

                System.out.println("+-----------------------------------------------+");
                System.out.println("| " + weapon.getName() + " berhasil dibeli.");
                System.out.println("+-----------------------------------------------+");
            } else {
                System.out.println("+-----------------------------------------------+");
                System.out.println("| Pembayaran gagal! Saldo tidak mencukupi.");
                System.out.println("+-----------------------------------------------+");
            }
        } else {
            System.out.println("+-----------------------------------------------+");
            System.out.println("| " + weapon.getName() + " telah habis dan tidak dapat dibeli.");
            System.out.println("+-----------------------------------------------+");
        }
    }

    // Menyediakan akses untuk daftar senjata yang dibeli
    public ArrayList<Weapon> getPurchasedWeapons() {
        return purchasedWeapons;
    }

    // Menyediakan akses untuk total pengeluaran
    public double getTotalSpent() {
        return totalSpent;
    }
}
