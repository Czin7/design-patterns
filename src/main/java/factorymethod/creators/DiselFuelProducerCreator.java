package factorymethod.creators;

import factorymethod.producers.DiselFuelProducer;
import factorymethod.producers.FuelProducer;

public class DiselFuelProducerCreator implements FuelProducerCreator {

    @Override
    public FuelProducer create() {
        return new DiselFuelProducer();
    }
}
