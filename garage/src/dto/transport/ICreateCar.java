package dto.transport;

import dto.parts.engine.api.IEngine;
import dto.parts.lock.api.ILock;
import dto.parts.tank.api.IFuelTank;
import dto.parts.wheels.api.IWheels;

public interface ICreateCar {
    String getName();
    String getModel();
    IEngine getEngine();
    IWheels getWheels();
    ILock getLock();
    IFuelTank getTank();

}
