package dto.transport.abstractFactory;

import dto.parts.engine.Engine;
import dto.parts.engine.api.IEngine;
import dto.parts.lock.Lock;
import dto.parts.lock.api.ILock;
import dto.parts.tank.Tank;
import dto.parts.tank.api.IFuelTank;
import dto.parts.wheels.Wheels;
import dto.parts.wheels.api.ETypeWheel;
import dto.parts.wheels.api.IWheels;
import dto.transport.ICreateElCar;

public class ElCarF implements ICreateElCar {
    String name = "Tesla";
    String model = "Roadster";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public IEngine getEngine() {
        return new Engine("SFZRE2B1XA3000112", 6);
    }

    @Override
    public IWheels getWheels() {
        return new Wheels(4, ETypeWheel.ЛЕТНИЙ);
    }

    @Override
    public ILock getLock() {
        return new Lock("qwerty");
    }

    @Override
    public IFuelTank getTank() {
        return new Tank(200);
    }
}
