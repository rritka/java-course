package dto.cars.FactoryMethod;

import dto.cars.api.ICar;

public class AudiFactory implements ICarFactory {

    @Override
    public ICar createCar() {
        return new AudiCar();
    }
}
