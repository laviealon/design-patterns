package iterator;

/**
 *
 * @param <T>
 */
public interface Iterable<T> {
    /**
     * Create an instance of an iterator to be applied
     * to this iterable.
     *
     * @return an iterator instance.
     */
    public Iterator<T> createIterator();
}
