package view;

import model.Weapon;
import java.util.ArrayList;

public class CustomerView {
  
    public void displayTotalPurchase(double totalSpent) {
        System.out.printf("Total pembayaran: $%.2f\n", totalSpent);
    }

    public void displayPurchasedWeapons(ArrayList<Weapon> purchasedWeapons) {
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
