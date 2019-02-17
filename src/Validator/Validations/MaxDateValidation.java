package Validator.Validations;

import Validator.Validation;
import java.util.Date;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class MaxDateValidation extends Validation<Date, Date> {

    public MaxDateValidation(Date payload) {
        super(payload);
    }

    @Override
    public boolean validate(Date field) {

        boolean res = false;

        if (this.payload != null && field != null) {
            res = this.payload.compareTo(field) >= 0;
        }

        return res;
    }

}
