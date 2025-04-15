public interface Drawable<T> {
	/**
	 * Returns an item from the collection.
	 * 
	 * @return the next item 
	 * @pre !isEmpty()
	 */
	T draw();
	
	/**
	 * @return true if the source is empty
	 */
	boolean isEmpty();
	
	/**
	 * @return a copy of this instance
	 */
	Drawable<T> copy();
}
