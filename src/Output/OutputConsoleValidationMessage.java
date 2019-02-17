package Output;

import Validator.ValidatorResponse.ValidatorResponse;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class OutputConsoleValidationMessage extends OutputConsole<ValidatorResponse> {

    @Override
    public void show(ValidatorResponse data) {
        System.out.println(data);
    }
    
}
