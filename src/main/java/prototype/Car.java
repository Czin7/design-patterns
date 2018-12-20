package prototype;

import java.util.Objects;

public class Car implements Cloneable<Car> {
    private String color;

    public Car(String color){
        this.color = color;
    }

    @Override
    public Car clone(Car car) {
        return new Car(car.color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
