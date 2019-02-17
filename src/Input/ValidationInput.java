package Input;

import Storage.ValidationStorage;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public abstract class ValidationInput {

    protected ValidationStorage storage;

    public abstract void init();
    
    public ValidationStorage getStorage() {
        return this.storage;
    }

}
