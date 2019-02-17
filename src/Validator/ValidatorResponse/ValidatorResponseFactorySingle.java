package Validator.ValidatorResponse;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class ValidatorResponseFactorySingle implements ValidatorResponseFactory {

    @Override
    public ValidatorResponse create() {
        return new ValidatorResponseSingle();
    }

}
