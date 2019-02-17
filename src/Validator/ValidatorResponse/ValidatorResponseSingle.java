package Validator.ValidatorResponse;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class ValidatorResponseSingle extends ValidatorResponse<String> {

    @Override
    public boolean isValid() {
        return this.message == null;
    }
    
}
