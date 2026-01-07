import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dispenser {
    private final Map<FuelType, Fuel> fuels = new HashMap<FuelType, Fuel>();
    private final List<Transaction> transactions = new ArrayList<>();

    public void addFuel(FuelType type, float quantity) {
        fuels.put(type, new Fuel(type, quantity));
    }
    public void restockFuel(FuelType type, float quantity) {
        Fuel fuel = fuels.get(type);
        if (fuel == null) {
            throw new FuelNotFoundException("Fuel type " + type + " doesn't exist");
        }
        fuel.addQuantity(quantity);
    }
    public Map<FuelType, Float> getAvailableFuel() {
        Map<FuelType, Float> availableFuel = new HashMap<>();
        fuels.forEach((type, fuel) -> availableFuel.put(type, fuel.getQuantity()));
        return availableFuel;
    }
    public Transaction dispenseByLiter(FuelType type, float liters, float dispenseAmount) {
        Fuel fuel = fuels.get(type);
        fuel.subtractQuantity(liters);

        Transaction myTx = new Transaction(type, liters, dispenseAmount);
        transactions.add(myTx);
        return myTx;
    }
    public Transaction dispenseByAmount(FuelType type, float dispenseAmount) {
        float liters = dispenseAmount / type.getPricePerLiter();
        return dispenseByLiter(type, liters, dispenseAmount);
    }

}
