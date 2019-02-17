package Validator.ValidatorResponse;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class ValidatorResponseFactoryMultiple implements ValidatorResponseFactory {

    @Override
    public ValidatorResponse create() {
        return new ValidatorResponseMultiple();
    }

}
