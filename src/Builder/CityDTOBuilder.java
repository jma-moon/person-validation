package Builder;

import DTO.Boundaries.CityDTO;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class CityDTOBuilder extends Builder<CityDTO> {

    public CityDTOBuilder() {
        this.item = new CityDTO();
    }

    public CityDTOBuilder setId(Integer id) {
        this.item.setId(id);
        return this;
    }

    public CityDTOBuilder setName(String name) {
        this.item.setName(name);
        return this;
    }

    public CityDTOBuilder setCountyId(Integer id) {
        item.setCountyId(id);
        return this;
    }

}
