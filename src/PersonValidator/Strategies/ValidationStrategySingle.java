package PersonValidator.Strategies;

import DTO.Person.PersonDTO;
import Adapter.PersonAdapter;
import Storage.ValidationStorage;
import Enum.PersonEnum;
import Validator.Validation;
import Validator.ValidationStrategy.ValidationStrategy;
import Validator.ValidatorResponse.ValidatorResponse;
import Validator.ValidatorResponse.ValidatorResponseFactorySingle;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class ValidationStrategySingle implements ValidationStrategy<PersonDTO> {

    @Override
    public ValidatorResponse validate(PersonDTO personDto, ValidationStorage storage) {

        ValidatorResponse response = new ValidatorResponseFactorySingle().create();
        Map<String, List<Validation>> validations = storage.getValidations();

        for (Map.Entry<String, List<Validation>> entry : validations.entrySet()) {

            String field = entry.getKey();
            List<Validation> fieldValidations = entry.getValue();

            if (fieldValidations != null) {
                Iterator<Validation> nameIterator = fieldValidations.iterator();
                String aux = validateField(nameIterator, new PersonAdapter().getValue(field, personDto));
                if (aux != null) {
                    response.setMessage(aux);
                    break;
                }
            }
        }

        return response;
    }

    private String validateField(Iterator<Validation> nameIterator, Object field) {

        String message = null;

        while (nameIterator.hasNext()) {
            String responseMessage = nameIterator.next().validate(field);

            if (responseMessage != null) {
                message = responseMessage;
                break;
            }
        }

        return message;
    }

}
