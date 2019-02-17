package Builder;

import DTO.Address.AddressDTO;
import DTO.Person.PersonDTO;
import java.util.Date;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class PersonDTOBuilder extends Builder<PersonDTO> {
    
    public PersonDTOBuilder() {
        this.item = new PersonDTO();
    }

    public PersonDTOBuilder setName(String name) {
        this.item.setName(name);
        return this;
    }

    public PersonDTOBuilder setLastName(String lastName) {
        this.item.setLastName(lastName);
        return this;
    }

    public PersonDTOBuilder setBirthDate(Date name) {
        this.item.setBirthDate(name);
        return this;
    }

    public PersonDTOBuilder setAddress(AddressDTO address) {
        this.item.setAddress(address);
        return this;
    }

}
