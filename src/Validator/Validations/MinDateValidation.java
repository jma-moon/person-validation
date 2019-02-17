package Validator.Validations;

import Validator.Validation;
import java.util.Date;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class MinDateValidation extends Validation<Date, Date> {

    public MinDateValidation(Date payload, String message) {
        super(payload, message);
    }

    @Override
    public String validate(Date field) {

        boolean res = false;

        if (this.payload != null && field != null) {
            res = this.payload.compareTo(field) <= 0;
        }

        return res ? null : this.message;
    }

}
