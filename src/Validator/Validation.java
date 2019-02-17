package Validator;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public abstract class Validation<Field, Payload> implements Validate<Field> {

    protected Payload payload;
    protected String message;

    public Validation(Payload payload, String message) {
        this.payload = payload;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
