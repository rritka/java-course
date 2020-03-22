package dto.transport.abstractFactory;

import dto.transport.ICreateCar;
import dto.parts.engine.Engine;
import dto.parts.engine.api.IEngine;
import dto.parts.lock.Lock;
import dto.parts.lock.api.ILock;
import dto.parts.tank.Tank;
import dto.parts.tank.api.IFuelTank;
import dto.parts.wheels.Wheels;
import dto.parts.wheels.api.ETypeWheel;
import dto.parts.wheels.api.IWheels;


public class CarF implements ICreateCar {
    private String name = "Ferrari";
    private String model = "F8 Spider";


    @Override
    public IEngine getEngine() {
        return new Engine("null", 1);
    }

    @Override
    public IWheels getWheels() {
        return new Wheels(340, ETypeWheel.ВСЕСЕЗОННЫЙ);
    }


    @Override
    public ILock getLock() {
        return new Lock("qwerty");
    }

    @Override
    public IFuelTank getTank() {
        return new Tank(25);
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }
}
