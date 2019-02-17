package Validator.Validators;

import Validator.Validator;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class MinLengthValidator extends Validator<String, Integer> {

    public MinLengthValidator(Integer payload) {
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
