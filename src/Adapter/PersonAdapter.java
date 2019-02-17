package Adapter;

import Adapter.Adapter;
import DTO.Person.PersonDTO;
import Enum.PersonEnum;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class PersonAdapter implements Adapter<PersonEnum, PersonDTO> {

    @Override
    public Object getValue(PersonEnum field, PersonDTO person) {

        Object value = null;

        if (person != null) {
            switch (field) {
                case name:
                    value = person.getName();
                    break;
                case lastName:
                    value = person.getLastName();
                    break;
                case bornDate:
                    value = person.getBornDate();
                    break;
                case address:
                    value = person.getAddress();
                    break;
                case line1:
                    value = person.getAddress() != null ?
                            person.getAddress().getLine1() : null;
                    break;
                case line2:
                    value = person.getAddress() != null ?
                            person.getAddress().getLine2() : null;
                    break;
                case line3:
                    value = person.getAddress() != null ?
                            person.getAddress().getLine3() : null;
                    break;
                case country:
                    value = person.getAddress() != null ?
                            person.getAddress().getCountry() : null;
                    break;
                case state:
                    value = person.getAddress() != null ?
                            person.getAddress().getState() : null;
                    break;
                case county:
                    value = person.getAddress() != null ?
                            person.getAddress().getCounty() : null;
                    break;
                case city:
                    value = person.getAddress() != null ?
                            person.getAddress().getCity() : null;
                    break;
            }
        }

        return value;
    }

}
