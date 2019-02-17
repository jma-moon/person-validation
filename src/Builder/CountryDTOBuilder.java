package Builder;

import DTO.Boundaries.CountryDTO;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class CountryDTOBuilder extends Builder<CountryDTO> {

    public CountryDTOBuilder() {
        this.item = new CountryDTO();
    }

    public CountryDTOBuilder setId(Integer id) {
        this.item.setId(id);
        return this;
    }

    public CountryDTOBuilder setName(String name) {
        this.item.setName(name);
        return this;
    }

}
