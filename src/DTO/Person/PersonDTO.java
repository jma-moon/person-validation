package DTO.Person;

import DTO.Address.AddressDTO;
import java.util.Date;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class PersonDTO {

    private String name;
    private String lastName;
    private Date birthDate;
    private AddressDTO address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date bornDate) {
        this.birthDate = bornDate;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

}
