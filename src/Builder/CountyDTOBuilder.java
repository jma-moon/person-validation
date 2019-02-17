package Builder;

import DTO.Boundaries.CountyDTO;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class CountyDTOBuilder extends Builder<CountyDTO> {

    public CountyDTOBuilder() {
        this.item = new CountyDTO();
    }

    public CountyDTOBuilder setId(Integer id) {
        this.item.setId(id);
        return this;
    }

    public CountyDTOBuilder setName(String name) {
        this.item.setName(name);
        return this;
    }

    public CountyDTOBuilder setStateId(Integer id) {
        item.setStateId(id);
        return this;
    }

}
