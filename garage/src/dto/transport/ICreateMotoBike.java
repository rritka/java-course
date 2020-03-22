package dto.transport;

import dto.parts.lock.api.IKey;
import dto.parts.wheels.api.IWheels;

public interface ICreateMotoBike {

    String getName();

    /**
     * Модель мотоцикла
     * @return
     */
    String getModel();
    IWheels getWheels();

}
