import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private FuelType fuelType;
    private float liters;
    private float totalCost;
    private float amountPaid;
    private LocalDateTime timestamp;

    public Transaction(FuelType fuelType, float liters, float amountPaid) {
        this.transactionId = transactionId;
        this.fuelType = fuelType;
        this.liters = liters;
        this.amountPaid = amountPaid;
        this.totalCost = calculateTotal();
        this.timestamp = LocalDateTime.now();

    }
    public float calculateTotal() {
        return liters * fuelType.getPricePerLiter();
    }
    public FuelType getFuelType() {
        return fuelType;
    }
    public float amountPaid() {
        return amountPaid;
    }
    public LocalDateTime timestamp() {
        return timestamp;
    }
    public float getLiters() {
        return liters;
    }
    public float getTotalCost() {
        return totalCost;
    }

}
