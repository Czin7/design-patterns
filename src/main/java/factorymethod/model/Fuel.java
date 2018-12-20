package factorymethod.model;

import java.math.BigDecimal;

public class Fuel {
    private FuelType fuelType;
    private BigDecimal amount;

    public Fuel(FuelType fuelType, BigDecimal amount) {
        this.fuelType = fuelType;
        this.amount = amount;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
