package dto.cars.api;

import dto.parts.lock.api.IKey;

public interface ICar {
    /**
     * Получить VIN автомобиля
     * @return
     */
    String getVin();

    /**
     * Наименование производителя
     * @return
     */
    String getName();

    /**
     * Модель автомобиля
     * @return
     */
    String getModel();

    /**
     * Количество колёс автобиля
     * @return
     */
    int getWheelCount();

    void open(IKey key);
    void close(IKey key);

    void start();
    void stop();

    double fillFuel(double value);

    void drive();
    void brake();

}
