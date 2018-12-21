package decorator;

public class TrimWhiteSpaceConverter implements Converter<String, String>  {
    private Converter<String, String> converter;

    public TrimWhiteSpaceConverter(Converter<String, String> converter) {
        this.converter = converter;
    }

    @Override
    public String convert(String value) {
        String valueAfterBaseConvertion = converter.convert(value);
        return valueAfterBaseConvertion.trim();
    }
}
