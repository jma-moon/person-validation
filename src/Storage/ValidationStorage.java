package Storage;

import Validator.Validation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public abstract class ValidationStorage {

    protected Map<String, List<Validation>> validations;

    public ValidationStorage() {
        this.validations = new LinkedHashMap<>();
    }

    public Map<String, List<Validation>> getValidations() {
        return this.validations;
    }

    public List<Validation> addFieldValidations(String field, List<Validation> validations) {
        return this.validations.put(field, validations);
    }

    public List<Validation> removeFieldValidation(String field) {
        return this.validations.remove(field);
    }

}
