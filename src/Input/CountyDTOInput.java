package Input;

import Builder.CountyDTOBuilder;
import DTO.Boundaries.CountyDTO;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class CountyDTOInput extends DTOInput<CountyDTO> {

    @Override
    public CountyDTO getDTO() {
        return new CountyDTOBuilder()
                .setId(3)
                .setName("County name")
                .setStateId(2)
                .build();
    }
    
}
