package Builder;

import DTO.Boundaries.StateDTO;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class StateDTOBuilder extends Builder<StateDTO> {

    public StateDTOBuilder() {
        this.item = new StateDTO();
    }

    public StateDTOBuilder setId(Integer id) {
        this.item.setId(id);
        return this;
    }

    public StateDTOBuilder setName(String name) {
        this.item.setName(name);
        return this;
    }

    public StateDTOBuilder setCountryId(Integer id) {
        item.setCountryId(id);
        return this;
    }

}
