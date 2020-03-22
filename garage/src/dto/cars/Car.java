package dto.cars;

import dto.parts.engine.api.IEngine;
import dto.parts.lock.api.IKey;
import dto.parts.lock.api.ILock;
import dto.parts.tank.api.IFuelTank;
import dto.parts.tank.exceptions.FillFuelWithStartEngineException;
import dto.parts.wheels.api.IWheels;

public class Car {
    private final String vin;
    private final String name;
    private final String model;
    private final int wheelCount;
    private IEngine engine;
    private IKey key;
    private ILock lock;
    private IFuelTank fuelTank;
    private IWheels wheels;


    Car(CarBuilder builder){
        this.vin = builder.getEngine().getVin();
        this.name = builder.getName();
        this.model = builder.getModel();
        this.wheelCount = builder.getWheelCount();
        this.engine = builder.getEngine();
        this.key = builder.getKey();
        this.lock = builder.getLock();
        this.fuelTank = builder.getFuelTank();
        this.wheels = builder.getWheels();
    }


    public double fillFuel(double value) throws FillFuelWithStartEngineException {
        if (engine.isWork() == false) {
            getFuelTank().fillFuel(value);
        } else {
            throw new FillFuelWithStartEngineException("you can't fill fuel with start engine");
        }return value;
    }

    public String getVin() {
        return vin;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public IEngine getEngine() {
        return engine;
    }

    public IKey getKey() {
        return key;
    }

    public ILock getLock() {
        return lock;
    }

    public IFuelTank getFuelTank() {
        return fuelTank;
    }

    public IWheels getWheels() {
        return wheels;
    }
}
