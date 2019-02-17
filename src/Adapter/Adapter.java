package Adapter;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public interface Adapter<Field, Item> {
    
    public abstract Object getValue(Field field, Item person);
    
}
