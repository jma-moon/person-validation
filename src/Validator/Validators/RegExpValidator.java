package Validator.Validators;

import Validator.Validator;
import java.util.regex.Pattern;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class RegExpValidator extends Validator<String, String> {

    private Pattern pattern;

    public RegExpValidator(String payload) {
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
