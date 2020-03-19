package dto.parts.wheels.api;


import dto.parts.api.IParts;

public interface IWheels extends IParts {
    ETypeWheel getType();
    int getRadius();
}
