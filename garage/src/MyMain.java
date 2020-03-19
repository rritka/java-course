import dto.cars.Car;
import dto.cars.CarBuilder;
import dto.parts.engine.Engine;
import dto.parts.engine.api.IEngine;
import dto.parts.lock.DefaultKey;
import dto.parts.lock.Lock;
import dto.parts.lock.api.IKey;
import dto.parts.lock.api.ILock;
import dto.parts.lock.exceptions.KeyIsWrongException;
import dto.parts.tank.Tank;
import dto.parts.tank.exceptions.FillFuelWithStartEngineException;
import dto.parts.wheels.Wheels;
import dto.parts.wheels.api.ETypeWheel;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("put your Key : ");
        String secretKey = scan.nextLine();
        IKey myKey = new DefaultKey(secretKey);

        System.out.println("put Lock : ");
        String keyOfLock = scan.nextLine();
        ILock myLock = new Lock(keyOfLock);
        IEngine engine = new Engine("V10", 5);

        CarBuilder audiBuilder = new CarBuilder()
                .model("R8 RWS")
                .name("Audi")
                .wheelCount(4)
                .engine(engine)
                .fuelTank(new Tank(20))
                .wheels(new Wheels(345, ETypeWheel.ЛЕТНИЙ))
                .key(myKey)
                .lock(myLock);
        Car car1 = audiBuilder.build();

        try {
            boolean open = myLock.open(myKey);
        } catch (KeyIsWrongException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("current fuel level : " + car1.getFuelTank().getFuelLevel());

        car1.getEngine().start();  //завели машину
        car1.getEngine().stop();   //заглушили машину
        System.out.println("is engine working? " + car1.getEngine().isWork());  //проверяем, машина завелась --> isWork = true

        try {
            car1.fillFuel(5);
        } catch (FillFuelWithStartEngineException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("fuel level after filling : " + car1.getFuelTank().getFuelLevel());

    }
}
