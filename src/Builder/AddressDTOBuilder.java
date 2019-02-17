package Builder;

import DTO.Address.AddressDTO;
import DTO.Boundaries.CityDTO;
import DTO.Boundaries.CountryDTO;
import DTO.Boundaries.CountyDTO;
import DTO.Boundaries.StateDTO;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class AddressDTOBuilder extends Builder<AddressDTO> {

    public AddressDTOBuilder() {
        this.item = new AddressDTO();
    }

    public AddressDTOBuilder setLine1(String line) {
        this.item.setLine1(line);
        return this;
    }

    public AddressDTOBuilder setLine2(String line) {
        this.item.setLine2(line);
        return this;
    }

    public AddressDTOBuilder setLine3(String line) {
        this.item.setLine3(line);
        return this;
    }

    public AddressDTOBuilder setCountry(CountryDTO country) {
        this.item.setCountry(country);
        return this;
    }

    public AddressDTOBuilder setState(StateDTO state) {
        this.item.setState(state);
        return this;
    }

    public AddressDTOBuilder setCounty(CountyDTO county) {
        this.item.setCounty(county);
        return this;
    }

    public AddressDTOBuilder setCity(CityDTO city) {
        this.item.setCity(city);
        return this;
    }

}
