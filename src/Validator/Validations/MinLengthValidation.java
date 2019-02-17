package Validator.Validations;

import Validator.Validation;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class MinLengthValidation extends Validation<String, Integer> {

    public MinLengthValidation(Integer payload) {
        super(payload);
    }

    @Override
    public boolean validate(String field) {

        boolean res = false;

        if (this.payload != null && field != null) {
            res = field.length() >= this.payload;
        }

        return res;
    }

}
