package Builder;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public abstract class Builder<T> {

    protected T item;

    public T build() {
        return this.item;
    }

}
