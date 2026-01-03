public enum FuelType {
    PETROL(65),
    DIESEL(67),
    KEROSENE(85),
    GASOLINE(90);

    private float pricePerLiter;

    FuelType(float pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }
    public float getPricePerLiter() {
        return pricePerLiter;
    }
    public void setPricePerLiter(float pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }
}
