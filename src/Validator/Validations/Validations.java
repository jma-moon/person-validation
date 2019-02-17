package Validator.Validations;

import Validator.Validation;
import java.util.Date;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class Validations {

    public static Validation min(Integer min) {
        return new MinValidation(min);
    }

    public static Validation max(Integer max) {
        return new MaxValidation(max);
    }

    public static Validation minLength(Integer minLength) {
        return new MinLengthValidation(minLength);
    }

    public static Validation maxLength(Integer maxLength) {
        return new MaxLengthValidation(maxLength);
    }

    public static Validation minDate(Date minDate) {
        return new MinDateValidation(minDate);
    }

    public static Validation maxDate(Date maxDate) {
        return new MaxDateValidation(maxDate);
    }

    public static Validation regExp(String regExp) {
        return new RegExpValidation(regExp);
    }

}
