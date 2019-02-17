package Validator.Validations;

import Validator.Validation;
import java.util.Date;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class Validations {

    public static Validation min(Integer min, String message) {
        return new MinValidation(min, message);
    }

    public static Validation max(Integer max, String message) {
        return new MaxValidation(max, message);
    }

    public static Validation minLength(Integer minLength, String message) {
        return new MinLengthValidation(minLength, message);
    }

    public static Validation maxLength(Integer maxLength, String message) {
        return new MaxLengthValidation(maxLength, message);
    }

    public static Validation minDate(Date minDate, String message) {
        return new MinDateValidation(minDate, message);
    }

    public static Validation maxDate(Date maxDate, String message) {
        return new MaxDateValidation(maxDate, message);
    }

    public static Validation regExp(String regExp, String message) {
        return new RegExpValidation(regExp, message);
    }

    public static Validation notNull(String message) {
        return new NotNullValidation(true, message);
    }
    
}
