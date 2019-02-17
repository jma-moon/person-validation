package Input;

import Builder.AddressDTOBuilder;
import DTO.Address.AddressDTO;
import DTO.Boundaries.CityDTO;
import DTO.Boundaries.CountryDTO;
import DTO.Boundaries.CountyDTO;
import DTO.Boundaries.StateDTO;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class AddressDTOInput extends DTOInput<AddressDTO> {

    @Override
    public AddressDTO getDTO() {
        
        CountryDTO country = new CountryDTOInput().getDTO();
        StateDTO state = new StateDTOInput().getDTO();
        CountyDTO county = new CountyDTOInput().getDTO();
        CityDTO city = new CityDTOInput().getDTO();
        
        return new AddressDTOBuilder()
                .setLine1("Santa Cruz Avenue")
                .setLine2("Parallel Street")
                .setLine3(null)
                .setCountry(country)
                .setState(state)
                .setCounty(county)
                .setCity(city)
                .build();
    }

}
