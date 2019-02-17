package DTO.Address;

import DTO.Boundaries.CountryDTO;
import DTO.Boundaries.StateDTO;
import DTO.Boundaries.CountyDTO;
import DTO.Boundaries.CityDTO;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class AddressDTO {

    private String line1;
    private String line2;
    private String line3;
    private CountryDTO country;
    private StateDTO state;
    private CountyDTO county;
    private CityDTO city;

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public CountryDTO getCountry() {
        return country;
    }

    public void setCountry(CountryDTO country) {
        this.country = country;
    }

    public StateDTO getState() {
        return state;
    }

    public void setState(StateDTO state) {
        this.state = state;
    }

    public CountyDTO getCounty() {
        return county;
    }

    public void setCounty(CountyDTO county) {
        this.county = county;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

}
