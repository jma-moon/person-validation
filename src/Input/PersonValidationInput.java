package Input;

import Enum.PersonEnum;
import Storage.PersonValidationStorage;
import Validator.Validation;
import Validator.Validations.Validations;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a class that emulates user's validation configuration
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
        
        this.setNameValidations();
        this.setLastNameValidations();
        this.setBirthDateValidations();
        this.setAddressValidations();
        this.setCountryValidations();

    }

    private void setNameValidations() {
        
        int maxLength = 40;
        int minLength = 2;

        List<Validation> name = new ArrayList<>();
        name.add(Validations.notNull("Name should not be empty."));
        name.add(Validations.maxLength(maxLength, "Name should have " + maxLength + " or less characters."));
        name.add(Validations.minLength(minLength, "Name should have " + minLength + " or more characters."));
        this.storage.addFieldValidations(PersonEnum.name.toString(), name);
    }
    
    private void setLastNameValidations() {
        
        int maxLength = 30;
        int minLength = 2;

        List<Validation> lastName = new ArrayList<>();
        lastName.add(Validations.notNull("Last name should not be empty."));
        lastName.add(Validations.maxLength(maxLength, "Last name should have " + maxLength + " or less characters."));
        lastName.add(Validations.minLength(minLength, "Last name should have " + minLength + " or more characters."));
        this.storage.addFieldValidations(PersonEnum.lastName.toString(), lastName);
    }
    
    private void setBirthDateValidations() {
        List<Validation> birthDate = new ArrayList<>();
        birthDate.add(Validations.notNull("Born date should not be empty."));
        this.storage.addFieldValidations(PersonEnum.birthDate.toString(), birthDate);
    }

    private void setAddressValidations() {
        List<Validation> address = new ArrayList<>();
        address.add(Validations.notNull("Address should not be empty."));
        this.storage.addFieldValidations(PersonEnum.address.toString(), address);
    }

    private void setCountryValidations() {
        List<Validation> country = new ArrayList<>();
        country.add(Validations.notNull("Country should not be empty."));
        this.storage.addFieldValidations(PersonEnum.country.toString(), country);
    }

}
