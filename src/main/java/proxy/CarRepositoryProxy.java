package proxy;

public class CarRepositoryProxy implements CarRepository {
    private TransactionManager transactionManager;
    private CarRepository carRepository;

    public CarRepositoryProxy(TransactionManager transactionManager, CarRepository carRepository) {
        this.transactionManager = transactionManager;
        this.carRepository = carRepository;
    }

    @Override
    public Car save(Car user) {
        int transactionId = transactionManager.beginTransaction();
        Car persistedCar = carRepository.save(user);
        transactionManager.commit(transactionId);
        return persistedCar;
    }
}
