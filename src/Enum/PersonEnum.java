package Enum;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public enum PersonEnum {

    name("name"),
    lastName("lastName"),
    bornDate("bornDate"),
    address("address"),
    line1("line1"),
    line2("line2"),
    line3("line3"),
    country("country"),
    state("state"),
    county("county"),
    city("city"),;

    private final String text;

    PersonEnum(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}
