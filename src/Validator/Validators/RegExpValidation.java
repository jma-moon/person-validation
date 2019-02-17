package Validator.Validators;

import Validator.Validation;
import java.util.regex.Pattern;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class RegExpValidation extends Validation<String, String> {

    private Pattern pattern;

    public RegExpValidation(String payload) {
        super(payload);

        this.pattern = Pattern.compile(payload);

    }

    @Override
    public boolean validate(String field) {

        boolean res = false;

        if (this.payload != null && field != null) {
            return this.pattern.matcher(field).matches();
        }

        return res;
    }

}
