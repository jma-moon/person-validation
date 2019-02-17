package Validator;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public abstract class Validator<Field, Payload> implements Validate<Field> {

    protected Payload payload;

    public Validator(Payload payload) {
        this.payload = payload;
    }

}
