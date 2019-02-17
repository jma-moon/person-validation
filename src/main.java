
import DTO.Person.PersonDTO;
import Input.PersonDTOInput;
import Input.PersonValidationInput;
import Output.Output;
import Output.OutputConsoleValidationMessage;
import PersonValidator.PersonValidator;
import PersonValidator.Strategies.ValidationStrategySingle;
import Storage.ValidationStorage;
import Validator.ValidationStrategy.ValidationStrategy;
import Validator.Validator;
import Validator.ValidatorResponse.ValidatorResponse;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class main {

    public static void main(String args[]) {

        PersonValidationInput inputValidation = new PersonValidationInput();
        inputValidation.init();
        ValidationStorage personStorage = inputValidation.getStorage();
        
        Validator validator = new PersonValidator();
        PersonDTO person1 = new PersonDTOInput().getDTO();
        ValidationStrategy strategy = new ValidationStrategySingle();
        ValidatorResponse response = validator.validate(person1, strategy, personStorage);

        Output output = new OutputConsoleValidationMessage();
        output.show(response);
    }

}
