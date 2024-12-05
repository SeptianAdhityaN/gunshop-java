package view;

import java.util.List;
import model.Weapon;

public class WeaponView {

    public void displayStock(List<Weapon> stockList) {
        System.out.println();
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.println("|                                       Senjata Tersedia                                    |");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.printf("| %-4s | %-15s | %-10s | %-10s | %-15s | %-20s |\n", 
                "No", "Name", "Price ($)", "Stock", "Type", "Additional Info");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        for (int i = 0; i < stockList.size(); i++) {
            Weapon weapon = stockList.get(i);
            System.out.printf("| %-4d | %-15s | %-10.2f | %-10d | %-15s | %-20s |\n",
                    (i + 1),
                    weapon.getName(),
                    weapon.getPrice(),
                    weapon.getStock(),
                    weapon.getType(),
                    weapon.getAdditionalInfo());
        }

        System.out.println("+-------------------------------------------------------------------------------------------+");
    }
}
