package Input;

import Enum.PersonEnum;
import Storage.PersonValidationStorage;
import Validator.Validation;
import Validator.Validations.Validations;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class PersonValidationInput extends ValidationInput {
    
    public PersonValidationInput() {
        super();
        this.storage = new PersonValidationStorage();
    }
    
    @Override
    public void init() {
        
        int maxLength = 30;
        int minLength = 2;

        List<Validation> name = new ArrayList<>();
        name.add(Validations.notNull("Name should not be null"));
        name.add(Validations.maxLength(maxLength, "Name should have " + maxLength + " or less characters."));
        name.add(Validations.minLength(minLength, "Name should have " + minLength + " or more characters."));
        this.storage.addFieldValidations(PersonEnum.name.toString(), name);

        List<Validation> lastName = new ArrayList<>();
        lastName.add(Validations.notNull("Last name should not be null"));
        lastName.add(Validations.maxLength(maxLength, "Last name should have " + maxLength + " or less characters."));
        lastName.add(Validations.minLength(minLength, "Last name should have " + minLength + " or more characters."));
        this.storage.addFieldValidations(PersonEnum.lastName.toString(), lastName);

        List<Validation> bornDate = new ArrayList<>();
        bornDate.add(Validations.notNull("Born date should not be null"));
        this.storage.addFieldValidations(PersonEnum.birthDate.toString(), bornDate);
        
        List<Validation> address = new ArrayList<>();
        address.add(Validations.notNull("Address should not be null"));
        this.storage.addFieldValidations(PersonEnum.address.toString(), address);

    }
}
