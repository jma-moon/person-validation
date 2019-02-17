package Validator.ValidationStrategy;

import Storage.ValidationStorage;
import Validator.ValidatorResponse.ValidatorResponse;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface ValidationStrategy<T> {

    public ValidatorResponse validate(T item, ValidationStorage storage);

}
