package Validator.Validators;

import Validator.Validator;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class MinValidator extends Validator<Integer, Integer> {

    public MinValidator(Integer payload) {
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
