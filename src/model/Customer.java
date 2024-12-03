package src.model;
import java.util.ArrayList;

public class Customer {
    private String name;
    private PaymentMethod paymentMethod;
    private double totalSpent;
    private ArrayList<Weapon> purchasedWeapons;  

    public Customer(String name, PaymentMethod paymentMethod) {
        this.name = name;
        this.paymentMethod = paymentMethod;
        this.totalSpent = 0.0;
        this.purchasedWeapons = new ArrayList<>();
    }

    public String getName() {
        return name;
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
            }
        } else {
            System.out.println("+-----------------------------------------------+");
            System.out.println("| " + weapon.getName() + " telah habis dan tidak dapat dibeli.");
            System.out.println("+-----------------------------------------------+");
        }
    }

    public void applyDiscount() {
        if (totalSpent >= 1000) {
            double discount = totalSpent * 0.1;
            totalSpent -= discount;
            System.out.printf("Anda mendapatkan potongan harga sebesar $%.2f!\n", discount);
        }
    }

    public void displayTotalPurchase() {
        System.out.printf("Total pembayaran: $%.2f\n", totalSpent);
    }

    public void displayPurchasedWeapons() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("|             Daftar Senjata yang Dibeli            |");
        System.out.println("+---------------------------------------------------+");
        if (purchasedWeapons.size() == 0) {
            System.out.println("| Tidak ada senjata yang dibeli.");
        } else {
            for (Weapon weapon : purchasedWeapons) {
                System.out.println("| " + weapon.getName() + " - Harga: $" + weapon.getPrice());
            }
        }
        System.out.println("+---------------------------------------------------+");
    }
}
