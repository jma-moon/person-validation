
import DTO.Person.PersonDTO;
import Input.PersonDTOInput;
import Input.PersonValidationInput;
import Output.Output;
import Output.OutputConsole;
import PersonValidator.PersonValidator;
import PersonValidator.Strategies.ValidationStrategyMultiple;
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
        ValidationStrategy singleStrategy = new ValidationStrategySingle();
        ValidationStrategy multipleStrategy = new ValidationStrategyMultiple();
        ValidatorResponse singleResponse = validator.validate(person1, singleStrategy, personStorage);
        ValidatorResponse multipleResponse = validator.validate(person1, multipleStrategy, personStorage);

        Output output = new OutputConsole();
        output.show("=======================\n"
                  + "Single message response\n"
                  + "=======================");
        output.show(singleResponse);
        output.show("\n");
        output.show("=========================\n"
                  + "Multiple message response\n"
                  + "=========================");
        output.show(multipleResponse);
        output.show("\n");
    }

}
