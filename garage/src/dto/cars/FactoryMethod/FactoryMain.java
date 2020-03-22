package dto.cars.FactoryMethod;

import dto.cars.FactoryMethod.AudiFactory;
import dto.cars.FactoryMethod.ICarFactory;
import dto.cars.api.ICar;

public class FactoryMain {
    public static void main(String[] args) {
        ICarFactory carFactory = new AudiFactory();
        ICar car = carFactory.createCar();

        System.out.println(car.getName());
    }
}
