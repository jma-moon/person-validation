package PersonValidator.Strategies;

import Adapter.PersonAdapter;
import DTO.Person.PersonDTO;
import Storage.ValidationStorage;
import Validator.Validation;
import Validator.ValidationStrategy.ValidationStrategy;
import Validator.ValidatorResponse.ValidatorResponse;
import Validator.ValidatorResponse.ValidatorResponseFactoryMultiple;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class ValidationStrategyMultiple implements ValidationStrategy<PersonDTO> {

    @Override
    public ValidatorResponse validate(PersonDTO personDto, ValidationStorage storage) {

        ValidatorResponse response = new ValidatorResponseFactoryMultiple().create();
        Map<String, List<Validation>> validations = storage.getValidations();
        List<String> messageList = new ArrayList<>();

        TestValidationMap(validations, personDto, messageList);

        response.setMessage(messageList);
        
        return response;
    }

    private void TestValidationMap(Map<String, List<Validation>> validations, PersonDTO personDto, List<String> response) {
        for (Map.Entry<String, List<Validation>> entry : validations.entrySet()) {
            
            String field = entry.getKey();
            List<Validation> fieldValidations = entry.getValue();

            if (fieldValidations != null) {
                Iterator<Validation> iterator = fieldValidations.iterator();
                List<String> aux = testValidationIterator(iterator, new PersonAdapter().getValue(field, personDto));
                if (aux != null) {
                    response.addAll(aux);
                }
            }
        }
    }

    private List<String> testValidationIterator(Iterator<Validation> iterator, Object field) {

        List<String> message = new ArrayList<>();

        while (iterator.hasNext()) {
            String responseMessage = iterator.next().validate(field);

            if (responseMessage != null) {
                message.add(responseMessage);
            }
        }

        return message;
    }

}
