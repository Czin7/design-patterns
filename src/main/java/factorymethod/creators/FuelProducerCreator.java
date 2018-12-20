package factorymethod.creators;

import factorymethod.producers.FuelProducer;

public interface FuelProducerCreator {
    public FuelProducer create();
}
