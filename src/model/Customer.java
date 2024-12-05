package model;
import java.util.ArrayList;

public class Customer {
    private String name;
    private double totalSpent;
    private ArrayList<Weapon> purchasedWeapons;  

    public Customer(String name, PaymentMethod paymentMethod) {
        this.name = name;
        this.totalSpent = 0.0;
        this.purchasedWeapons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public ArrayList<Weapon> getPurchasedWeapons() {
        return purchasedWeapons;
    }
}
