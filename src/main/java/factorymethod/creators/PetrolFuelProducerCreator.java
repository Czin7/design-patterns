package factorymethod.creators;

import factorymethod.producers.FuelProducer;
import factorymethod.producers.PetrolFuelProducer;

public class PetrolFuelProducerCreator implements FuelProducerCreator {

    @Override
    public FuelProducer create() {
        return new PetrolFuelProducer();
    }
}
