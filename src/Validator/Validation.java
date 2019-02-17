package Validator;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public abstract class Validation<Field, Payload> implements Validate<Field> {

    protected Payload payload;

    public Validation(Payload payload) {
        this.payload = payload;
    }

}
