package Validator.Validators;

import Validator.Validation;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class MaxLengthValidation extends Validation<String, Integer> {

    public MaxLengthValidation(Integer payload) {
        super(payload);
    }

    @Override
    public boolean validate(String field) {

        boolean res = false;

        if (this.payload != null && field != null) {
            res = field.length() <= this.payload;
        }

        return res;
    }

}
