package controller;

import java.util.ArrayList;
import model.Weapon;

public class WeaponController {
    private ArrayList<Weapon> stockList = new ArrayList<>();

    public void addWeapon(Weapon weapon) {
        stockList.add(weapon);
    }

    public Weapon selectWeapon(int index) {
        if (index >= 0 && index < stockList.size()) {
            return stockList.get(index);
        } else {
            return null;
        }
    }

    public ArrayList<Weapon> getStockList() {
        return stockList;
    }
}
