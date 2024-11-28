public class Pistol extends Weapon {
    private double caliber;

    public Pistol(String name, double price, int stock, double caliber) {
        super(name, price, stock);
        this.caliber = caliber;
    }

    @Override
    public String getType() {
        return "Pistol";
    }

    @Override
    public String getAdditionalInfo() {
        return "Kaliber: " + caliber + " mm";
    }
}
