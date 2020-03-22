package dto.transport.abstractFactory;

import dto.parts.lock.api.IKey;
import dto.parts.wheels.Wheels;
import dto.parts.wheels.api.ETypeWheel;
import dto.parts.wheels.api.IWheels;
import dto.transport.ICreateMotoBike;

public class MotoBikeF implements ICreateMotoBike {
    String name = "Yamaha";
    String model = "FZ S V3";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public IWheels getWheels() {
        return new Wheels(600, ETypeWheel.ЛЕТНИЙ);
    }



}
