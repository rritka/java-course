package dto.cars.FactoryMethod;

import dto.cars.api.ICar;
import dto.parts.engine.api.IEngine;
import dto.parts.lock.api.IKey;
import dto.parts.lock.api.ILock;
import dto.parts.tank.api.IFuelTank;
import dto.parts.wheels.api.IWheels;

public class BmwCar implements ICar {
    private String vin;
    private final String name = "BMW";
    private String model;
    private int wheelCount;
    private IEngine engine;
    private IKey key;
    private ILock lock;
    private IFuelTank fuelTank;
    private IWheels wheels;

    @Override
    public String getVin() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getWheelCount() {
        return 0;
    }

    @Override
    public void open(IKey key) {

    }

    @Override
    public void close(IKey key) {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public double fillFuel(double value) {
        return 0;
    }

    @Override
    public void drive() {

    }

    @Override
    public void brake() {

    }
}
