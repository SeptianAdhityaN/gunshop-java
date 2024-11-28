import java.util.ArrayList;

public class Store {
    private ArrayList<Weapon> stockList = new ArrayList<>();

    public void addWeapon(Weapon weapon) {
        stockList.add(weapon);
    }

    public void tampilkanStock() {
        System.out.println();
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.println("|                                       Senjata Tersedia                                    |");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.printf("| %-4s | %-15s | %-10s | %-10s | %-15s | %-20s |\n", "No", "Name", "Price ($)", "Stock", "Type", "Additional Info");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        for (int i = 0; i < stockList.size(); i++) {
            System.out.printf("| %-4d | %-15s | %-10.2f | %-10d | %-15s | %-20s |\n",
                    (i + 1),
                    stockList.get(i).getName(),
                    stockList.get(i).getPrice(),
                    stockList.get(i).getStock(),
                    stockList.get(i).getType(),  
                    stockList.get(i).getAdditionalInfo()  
            );
        }

        System.out.println("+-------------------------------------------------------------------------------------------+");
    }

    public Weapon selectWeapon(int index) {
        if (index >= 0 && index < stockList.size()) {
            return stockList.get(index);
        } else {
            return null;
        }
    }
}
