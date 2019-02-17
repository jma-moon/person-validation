package Validator.Validators;

import Validator.Validator;
import java.util.Date;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class Validators {

    public static Validator min(Integer min) {
        return new MinValidator(min);
    }

    public static Validator max(Integer max) {
        return new MaxValidator(max);
    }

    public static Validator minLength(Integer minLength) {
        return new MinLengthValidator(minLength);
    }

    public static Validator maxLength(Integer maxLength) {
        return new MaxLengthValidator(maxLength);
    }

    public static Validator minDate(Date minDate) {
        return new MinDateValidator(minDate);
    }

    public static Validator maxDate(Date maxDate) {
        return new MaxDateValidator(maxDate);
    }

    public static Validator regExp(String regExp) {
        return new RegExpValidator(regExp);
    }

}
