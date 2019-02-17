package Validator.ValidatorResponse;

import java.util.List;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
public class ValidatorResponseMultiple extends ValidatorResponse<List<String>> {

    @Override
    public boolean isValid() {
        return message.isEmpty();
    }
@Override
    public String toString() {
        if (this.isValid()) {
            return "Valid person";
        } else {
            String result = "";
            
            for (String aMessage : this.message) {
                result += aMessage + "\n";
            }
            
            return result;
        }
    }
    
    public void addMessage(String message) {
        this.message.add(message);
    }
}
