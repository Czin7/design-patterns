package builder;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuilderTest {


    @Test
    public void givenCarBuilder_whenBuild_thenShouldCreateCar(){
        Car.CarBuilder carBuilder;

        carBuilder = new Car.CarBuilder(EngineType.ON, "RED");
        Car car = carBuilder
                .setAdditionalParameter1("V1")
                .setAdditionalParameter2("V2")
                .build();

        assertTrue(car != null);
        assertTrue(car.getColor().equals("RED"));
        assertTrue(EngineType.ON.equals(car.getEngineType()));
        assertTrue(car.getAdditionalParameter1().equals("V1"));
        assertTrue(car.getAdditionalParameter2().equals("V2"));
    }

}
