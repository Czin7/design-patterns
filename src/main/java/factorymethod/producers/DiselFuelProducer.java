package factorymethod.producers;

import factorymethod.model.Fuel;
import factorymethod.model.FuelType;

import java.math.BigDecimal;

public class DiselFuelProducer implements FuelProducer {

    @Override
    public Fuel produce(BigDecimal amount) {
        return new Fuel(FuelType.ON, amount);
    }
}
