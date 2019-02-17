package Input;

import Builder.StateDTOBuilder;
import DTO.Boundaries.StateDTO;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class StateDTOInput extends DTOInput<StateDTO> {

    @Override
    public StateDTO getDTO() {
        return new StateDTOBuilder()
                .setId(2)
                .setName("State name")
                .setCountryId(1)
                .build();
    }
    
}
