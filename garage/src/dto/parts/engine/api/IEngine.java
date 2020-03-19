package dto.parts.engine.api;

import dto.parts.api.IParts;
import dto.parts.engine.exceptions.EngineNotStartedException;

public interface IEngine extends IParts {
    String getVin();
    int getVolume();

    boolean start();
    boolean stop();
    boolean isWork();

    double drive(double energy) throws EngineNotStartedException;
}
