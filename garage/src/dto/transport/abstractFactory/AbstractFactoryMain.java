package dto.transport.abstractFactory;

import dto.transport.ICreateBike;
import dto.transport.ICreateCar;
import dto.parts.engine.api.IEngine;
import dto.parts.lock.api.ILock;
import dto.parts.tank.api.IFuelTank;
import dto.parts.wheels.api.IWheels;
import dto.transport.ICreateElCar;
import dto.transport.ICreateMotoBike;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        ICreateCar ferrari = new CarF();
        IEngine engine = ferrari.getEngine();
        IWheels wheels = ferrari.getWheels();
        IFuelTank tank = ferrari.getTank();
        ILock lock = ferrari.getLock();

        System.out.println(ferrari.getName() + " " + ferrari.getModel());

        ICreateElCar teslaRoadster = new ElCarF();

        System.out.println(teslaRoadster.getName() + " " + teslaRoadster.getModel());

        ICreateBike myBike = new BikeF();
        System.out.println(myBike.getName() + " " + myBike.getModel());

        ICreateMotoBike myMot = new MotoBikeF();
        System.out.println(myMot.getName() + " " + myMot.getModel());

    }
}
