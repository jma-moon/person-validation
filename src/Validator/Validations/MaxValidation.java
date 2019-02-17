package Validator.Validations;

import Validator.Validation;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class MaxValidation extends Validation<Integer, Integer> {

    public MaxValidation(Integer payload, String message) {
        super(payload, message);
    }

    @Override
    public String validate(Integer field) {

        boolean res = false;

        if (this.payload != null && field != null) {
            res = field <= this.payload;
        }

        return res ? null : this.message;
    }

}
