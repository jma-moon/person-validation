package Input;

import Builder.CountryDTOBuilder;
import DTO.Boundaries.CountryDTO;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class CountryDTOInput extends DTOInput<CountryDTO> {

    @Override
    public CountryDTO getDTO() {
        return new CountryDTOBuilder()
                .setId(1)
                .setName("Bolivia")
                .build();
    }
    
    
    
}
