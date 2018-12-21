package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecoratorTest {

    @Test
    public void givenTrimWhiteSpaceConverterDecorator_whenConvert_thenShouldConvertToUpperCaseAndTrim(){
        Converter<String, String> uperCaseConverter = new UpperCaseConverter();
        Converter<String, String> trimWhiteSpacesConverter = new TrimWhiteSpaceConverter(uperCaseConverter);

        String valueAfterConvertion = trimWhiteSpacesConverter.convert(" teSt tEst ");

        assertTrue("TEST TEST".equals(valueAfterConvertion));
    }

}
