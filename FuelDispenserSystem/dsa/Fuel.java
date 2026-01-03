public class Fuel {
    private FuelType type;
    private float quantity;

    public Fuel(FuelType type, float quantity) {
        this.type = type;
        this.quantity = quantity;
    }
    public FuelType getType() {
        return type;
    }
    public float getQuantity() {
        return quantity;
    }
    public void addQuantity(float amount) {
        quantity += amount;
    }
    public void subtractQuantity(float liters) {
        if(liters > quantity) {
            throw new FuelDispenserException("Liters cannot be greater than quantity");
        }
        quantity -= liters;
    }

}
