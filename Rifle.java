public class Rifle extends Weapon {
    private int range;

    public Rifle(String name, double price, int stock, int range) {
        super(name, price, stock);
        this.range = range;
    }

    @Override
    public String getType() {
        return "Rifle";
    }

    @Override
    public String getAdditionalInfo() {
        return "Jarak: " + range + " meters";
    }
}
