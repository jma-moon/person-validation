package Validator.ValidatorResponse;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public abstract class ValidatorResponse<T> {
    
    T message;
    
    public abstract boolean isValid();
    
    public void setMessage(T message) {
        this.message = message;
    }
}
