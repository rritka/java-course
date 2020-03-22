package dto.parts.engine;


import dto.parts.engine.api.IEngine;
import dto.parts.engine.exceptions.EngineNotStartedException;

public class Engine implements IEngine {
    private final String vin;
    private final int volume;
    private boolean work = false;

    public Engine(String vin, int volume) {
        this.vin = vin;
        this.volume = volume;
    }



    @Override
    public String getVin() {
        return vin;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public boolean start() {
        if(!isWork()){
            work = true;
        }
        return work;
    }

    @Override
    public boolean stop() {
        if(isWork()){
            work = false;
        }
        return !work;
    }

    @Override
    public double drive(double energy) throws EngineNotStartedException {
        if(!isWork()){
            throw new EngineNotStartedException("Заведите машину");
        }
        return energy * 0.4;
    }

    public boolean isWork() {
        return this.work;
    }

}
