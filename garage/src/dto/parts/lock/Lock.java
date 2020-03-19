package dto.parts.lock;

import dto.parts.lock.api.IKey;
import dto.parts.lock.api.ILock;
import dto.parts.lock.exceptions.KeyIsWrongException;

public class Lock implements ILock {
    private boolean open;
    private final String closeKey;

    public Lock(String closeKey) {
        this.closeKey = closeKey;
    }

    @Override
    public boolean open(IKey key) throws KeyIsWrongException {
        if(closeKey.equals(key.getOpenKey())){
            open = true;
        } else {
            throw new KeyIsWrongException("key is not equal lock");
        }
        return open;
    }

    @Override
    public boolean close(IKey key){
        if(closeKey.equals(key.getOpenKey())){
            open = false;
        }
        return !open;
    }
}
