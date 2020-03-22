package dto.transport;

import dto.parts.wheels.api.IWheels;

public interface ICreateBike {
    String getName();
    String getModel();
    IWheels getWheels();
}
