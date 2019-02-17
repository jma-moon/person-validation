package Input;

import Builder.CityDTOBuilder;
import DTO.Boundaries.CityDTO;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class CityDTOInput extends DTOInput<CityDTO> {

    @Override
    public CityDTO getDTO() {
        return new CityDTOBuilder()
                .setId(4)
                .setName("Cochabamba")
                .setCountyId(3)
                .build();
    }
    
}
