package Validator;

import Storage.ValidationStorage;
import Validator.ValidationStrategy.ValidationStrategy;
import Validator.ValidatorResponse.ValidatorResponse;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public abstract class Validator<T> {

    public ValidatorResponse validate(T item, ValidationStrategy<T> strategy, ValidationStorage storage) {
        return strategy.validate(item, storage);
    }
}
