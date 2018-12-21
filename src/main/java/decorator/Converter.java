package decorator;

public interface Converter<R, T> {
    public R convert(T value);
}
