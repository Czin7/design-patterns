package factorymethod.producers;

import factorymethod.model.Fuel;

import java.math.BigDecimal;

public interface FuelProducer {
    public Fuel produce(BigDecimal amount);
}
