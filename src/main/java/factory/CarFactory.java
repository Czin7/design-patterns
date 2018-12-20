package factory;

import factory.model.Car;
import factory.model.CarType;
import factory.model.DiselCar;
import factory.model.PetrolCar;

public class CarFactory {

    public Car create(CarType carType){
        if(CarType.PETROL.equals(carType)) return new PetrolCar();
        if(CarType.DISEL.equals(carType)) return new DiselCar();
        throw new IllegalArgumentException();
    }
}
