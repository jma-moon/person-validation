package Validator.Validations;

import Validator.Validation;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class MinLengthValidation extends Validation<String, Integer> {

    public MinLengthValidation(Integer payload, String message) {
        super(payload, message);
    }

    @Override
    public String validate(String field) {

        boolean res = false;

        if (this.payload != null && field != null) {
            res = field.length() >= this.payload;
        }

        return res ? null : this.message;
    }

}
