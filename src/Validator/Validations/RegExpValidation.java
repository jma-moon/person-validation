package Validator.Validations;

import Validator.Validation;
import java.util.regex.Pattern;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class RegExpValidation extends Validation<String, String> {

    private Pattern pattern;

    public RegExpValidation(String payload, String message) {
        super(payload, message);

        this.pattern = Pattern.compile(payload);

    }

    @Override
    public String validate(String field) {

        boolean res = false;

        if (this.payload != null && field != null) {
            res = this.pattern.matcher(field).matches();
        }

        return res ? null : this.message;
    }

}
