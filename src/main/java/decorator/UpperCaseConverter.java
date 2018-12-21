package decorator;

public class UpperCaseConverter implements Converter<String, String> {

    @Override
    public String convert(String value) {
        return value.toUpperCase();
    }
}
