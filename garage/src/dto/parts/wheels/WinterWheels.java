package dto.parts.wheels;

import dto.parts.wheels.api.ETypeWheel;
import dto.parts.wheels.api.IWheels;

public class WinterWheels implements IWheels {
    private final int radius;
    private final ETypeWheel type = ETypeWheel.ЗИМНИЙ;

    public WinterWheels(int radius) {
        this.radius = radius;
    }

    @Override
    public final ETypeWheel getType() {
        return type;
    }

    @Override
    public int getRadius() {
        return radius;
    }
}
