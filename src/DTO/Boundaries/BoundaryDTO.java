package DTO.Boundaries;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public abstract class BoundaryDTO {

    protected Integer id;
    protected String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
