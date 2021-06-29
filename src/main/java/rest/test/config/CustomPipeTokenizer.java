package rest.test.config;

import org.aeonbits.owner.Tokenizer;

/**
 * @author amatsaylo on 10/10/19
 * @project rest-automation
 */

public class CustomPipeTokenizer implements Tokenizer {

    // this logic can be as much complex as you need
    @Override
    public String[] tokens(String values) {
        return values.split("\\;", -1);
    }
}