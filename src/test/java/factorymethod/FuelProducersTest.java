package factorymethod;

import factorymethod.model.Fuel;
import factorymethod.model.FuelType;
import factorymethod.producers.FuelProducer;
import factorymethod.producers.PetrolFuelProducer;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FuelProducersTest {

    @Test
    public void givenPetrolFuelProducer_whenProduce_thenShouldProducePetrolFuel(){
        FuelProducer fuelProducer = new PetrolFuelProducer();
        BigDecimal fuelAmountToBeProduced = BigDecimal.valueOf(100L);

        Fuel fuel = fuelProducer.produce(fuelAmountToBeProduced);

        assertTrue(FuelType.PB.equals(fuel.getFuelType()));
        assertTrue(fuelAmountToBeProduced.equals(fuel.getAmount()));
    }

}
