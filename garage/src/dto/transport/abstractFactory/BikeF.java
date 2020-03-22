package dto.transport.abstractFactory;

import dto.parts.wheels.Wheels;
import dto.parts.wheels.api.ETypeWheel;
import dto.transport.ICreateBike;
import dto.parts.wheels.api.IWheels;

public class BikeF implements ICreateBike {
    String name = "Аист";
    String model = "113-351";

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
        return new Wheels(400, ETypeWheel.ЛЕТНИЙ);
    }
}
