package proxy;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;

public class CarRepositoryProxyTest {

    @Test
    public void givenCarRepositoryProxy_whenSave_thenShouldSaveWithingTransaction(){
        TransactionManager transactionManager = Mockito.mock(TransactionManager.class);
        CarRepository fakeCarRepository = new FakeCarRepository();
        CarRepositoryProxy carRepositoryProxy = new CarRepositoryProxy(transactionManager, fakeCarRepository);
        Car car = new Car();

        Car persistedCar = carRepositoryProxy.save(car);

        assertTrue(persistedCar != null);
        Mockito.verify(transactionManager, times(1)).beginTransaction();
        Mockito.verify(transactionManager, times(1)).commit(0);
    }
}
