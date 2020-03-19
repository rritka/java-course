package dto.parts.lock.api;


import dto.parts.api.IParts;
import dto.parts.lock.exceptions.KeyIsWrongException;

public interface ILock extends IParts {

    /**
     * Открыть замок
     * @param key ключ которым мы пытаемся открыть замок
     * @return true если замок открылся, false если замок не открылся
     */
    boolean open(IKey key) throws KeyIsWrongException, KeyIsWrongException;

    /**
     * Закрыть замок
     * @param key ключ которым мы пытаемся закрыть замок
     * @return true если замок закрылся, false если замок не закрылся
     */
    boolean close(IKey key);
}
