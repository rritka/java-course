package dto.cars.FactoryMethod;

import dto.cars.api.ICar;

public class BmwFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new BmwCar();
    }
}
