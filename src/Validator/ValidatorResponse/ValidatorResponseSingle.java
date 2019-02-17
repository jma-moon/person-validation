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

    @Override
    public String toString() {
        if (this.isValid()) {
            return "Valid person";
        } else {
            return this.message;
        }
    }
}
