package Validator.ValidatorResponse;

import java.util.List;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class ValidatorResponseMultiple extends ValidatorResponse<List<String>> {

    @Override
    public boolean isValid() {
        return message.isEmpty();
    }

}
