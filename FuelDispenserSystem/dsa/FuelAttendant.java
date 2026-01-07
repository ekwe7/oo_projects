import java.util.Map;

public class FuelAttendant {
    private String name;
    private Dispenser dispenser;

    public FuelAttendant(String name, Dispenser dispenser) {
        this.name = name;
        this.dispenser = dispenser;
    }
    public void addNewFuel(FuelType type, float quantity) {
        dispenser.addFuel(type, quantity);
    }
    public void restockFuel(FuelType type, float quantity) {
        dispenser.restockFuel(type, quantity);
    }
    public void updateFuel(FuelType type, float newPrice) {
        type.setPricePerLiter(newPrice);
    }
    public Map<FuelType, Float> getAvailableFuel() {
        return dispenser.getAvailableFuel();
    }
    public Receipt sellByLiters(FuelType type, float liters, float pricePaid) {
        return new Receipt(dispenser.dispenseByAmount(type, pricePaid));
    }
    public Receipt  sellByAmount(FuelType type, float amount) {
        return new Receipt(dispenser.dispenseByAmount(type, amount));
    }
}
