package dto.parts.lock;

import dto.parts.lock.api.IKey;

public class DefaultKey implements IKey {

    private final String openKey;

    public DefaultKey(String openKey) {
        this.openKey = openKey;
    }

    @Override
    public String getOpenKey() {
        return this.openKey;
    }
}
