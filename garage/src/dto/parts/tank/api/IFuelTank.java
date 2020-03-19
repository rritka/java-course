package dto.parts.tank.api;


import dto.parts.api.IParts;

public interface IFuelTank extends IParts {
    /**
     * Общий объём бака
     * @return объём в ml
     */
    int getVolume();

    /**
     * Текущий уровень топлива в баке
     * @return текущий объём в ml
     */
    double getFuelLevel();

    /**
     * Заправка топлива
     * @param value количество топлива которое мы хотим залить
     * @return сколько топлива нам не влезло в бак
     */
    double fillFuel(double value);

    /**
     * Израсходовать топливо из бака
     * @param value количество топлива которое мы хотим израсходовать.
     *              Не может быть отрицательным.
     * @return Оставщийся уровень топлива
     */
    double consumeFuel(double value);
}
