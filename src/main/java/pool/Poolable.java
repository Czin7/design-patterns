package pool;

import java.util.Optional;

public interface Poolable<T> {
    public Optional<T> get();
    public void release(T t);
}
