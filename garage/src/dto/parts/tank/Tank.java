package dto.parts.tank;


import dto.parts.tank.api.IFuelTank;

public class Tank implements IFuelTank {
    private final int volume;
    private double currentFuelLevel;

    public Tank(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public double getFuelLevel() {
        return currentFuelLevel;
    }

    @Override
    public double fillFuel(double value) {
        if(currentFuelLevel + value > volume){
            double more = currentFuelLevel + value - volume;
            currentFuelLevel = volume;
            return more;
        } else {
            currentFuelLevel += value;
        }
        return 0;
    }

    @Override
    public double consumeFuel(double value) {
        return currentFuelLevel - value;
    }
}
