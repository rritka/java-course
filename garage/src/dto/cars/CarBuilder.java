package dto.cars;

import dto.parts.engine.api.IEngine;
import dto.parts.engine.Engine;
import dto.parts.engine.api.IEngine;
import dto.parts.lock.api.IKey;
import dto.parts.lock.api.ILock;
import dto.parts.tank.api.IFuelTank;
import dto.parts.wheels.api.IWheels;

public class CarBuilder {

    private String name;
    private String model;
    private int wheelCount;
    private IEngine engine;
    private IKey key;
    private ILock lock;
    private IFuelTank fuelTank;
    private IWheels wheels;

    public CarBuilder engine(IEngine engine){
        this.engine = engine;
        return this;
    }

    public CarBuilder key(IKey key){
        this.key = key;
        return this;
    }

    public CarBuilder lock(ILock lock){
        this.lock = lock;
        return this;
    }
    public CarBuilder fuelTank(IFuelTank fuelTank){
        this.fuelTank = fuelTank;
        return this;
    }
    public CarBuilder wheels(IWheels wheels){
        this.wheels = wheels;
        return this;
    }

    public CarBuilder name(String name){
        this.name = name;
        return this;
    }

    public CarBuilder model(String model){
        this.model = model;
        return this;
    }

    public CarBuilder wheelCount(int wheelCount){
        this.wheelCount = wheelCount;
        return this;
    }


    public IEngine getEngine() {
        return engine;
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

    public Car build(){
        return new Car(this);
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
