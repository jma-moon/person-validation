package Validator.Validators;

import Validator.Validation;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class MinValidation extends Validation<Integer, Integer> {

    public MinValidation(Integer payload) {
        super(payload);
    }

    @Override
    public boolean validate(Integer field) {

        boolean res = false;

        if (this.payload != null && field != null) {
            res = field >= this.payload;
        }

        return res;
    }

}
