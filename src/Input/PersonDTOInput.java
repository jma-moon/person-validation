package Input;

import Builder.PersonDTOBuilder;
import DTO.Address.AddressDTO;
import DTO.Person.PersonDTO;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class PersonDTOInput extends DTOInput<PersonDTO> {

    @Override
    public PersonDTO getDTO() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        Date birthDate;

        try {
            birthDate = dateFormat.parse("2001/10/20");
        } catch (Exception e) {
            birthDate = null;
        }
        AddressDTO address = new AddressDTOInput().getDTO();

        return new PersonDTOBuilder()
                .setName("Jose")
                .setLastName("Arandia")
                .setBirthDate(birthDate)
                .setAddress(address)
                .build();
    }

}
