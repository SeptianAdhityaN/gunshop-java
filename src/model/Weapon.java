package model;

public abstract class Weapon {
    private String name;
    private double price;
    private int stock;

    public Weapon(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock() {
        if (stock > 0) {
            stock--;
        } else {
            System.out.println("Stok kosong!");
        }
    }

    public abstract String getType();

    public abstract String getAdditionalInfo();
}
