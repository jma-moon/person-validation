package Output;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class OutputConsole extends Output<Object> {

    @Override
    public void show(Object data) {
        System.out.println(data);
    }
}
