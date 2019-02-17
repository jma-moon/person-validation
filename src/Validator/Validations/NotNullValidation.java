package Validator.Validations;

import Validator.Validation;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class NotNullValidation extends Validation<Object, Boolean> {

    public NotNullValidation(Boolean payload, String message) {
        super(payload, message);
    }

    @Override
    public String validate(Object field) {
        
        boolean res = false;

        if (this.payload) {
            res = field != null;
        }

        return res ? null : this.message;
    }
    
}
