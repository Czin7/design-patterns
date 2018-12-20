package factorymethod;

import factorymethod.creators.DiselFuelProducerCreator;
import factorymethod.creators.FuelProducerCreator;
import factorymethod.creators.PetrolFuelProducerCreator;
import factorymethod.producers.DiselFuelProducer;
import factorymethod.producers.FuelProducer;
import factorymethod.producers.PetrolFuelProducer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FuelProducerCreatorsTest {

    @Test
    public void givenPetrolFuelProducerCreator_whenCreate_thenShouldCreatePetrolFuelProducer(){
        FuelProducerCreator fuelProducerCreator = new PetrolFuelProducerCreator();

        FuelProducer fuelProducer = fuelProducerCreator.create();

        assertTrue(fuelProducer instanceof PetrolFuelProducer);
    }

    @Test
    public void givenDiselFuelProducerCreator_whenCreate_thenShouldCreateDiselFuelProducer(){
        FuelProducerCreator fuelProducerCreator = new DiselFuelProducerCreator();

        FuelProducer fuelProducer = fuelProducerCreator.create();

        assertTrue(fuelProducer instanceof DiselFuelProducer);
    }
}
