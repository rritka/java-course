package dto.parts.wheels;

import dto.parts.wheels.api.ETypeWheel;
import dto.parts.wheels.api.IWheels;

public class Wheels implements IWheels {
    private final int radius;
    private final ETypeWheel type;

    public Wheels(int radius, ETypeWheel type) {
        this.radius = radius;
        this.type = type;
    }

    @Override
    public int getRadius() {
        return radius;
    }

    @Override
    public ETypeWheel getType() {
        return type;
    }
}
