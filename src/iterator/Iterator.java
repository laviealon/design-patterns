package iterator;

/**
 *
 * @param <T>
 */
public interface Iterator<T> {
    /**
     * Check whether the iterable has a next element.
     *
     * @return true if iterable has a next element,
     * and false otherwise.
     */
    public boolean hasNext();

    /**
     * Get the next element in the iterable.
     *
     * @return the next element in the iterable.
     *
     * Precondition:
     *  - only called if hasNext() returns true.
     */
    public T next();

}
