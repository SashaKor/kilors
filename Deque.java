
public interface Deque<Card> {

boolean	add(E e)
//Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.

    void	addFirst(E e)
//Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions.

    void	addLast(E e)
//Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions.

    boolean	contains(Object o)
//Returns true if this deque contains the specified element.
Iterator<E>	descendingIterator()
Returns an iterator over the elements in this deque in reverse sequential order.
E	element()
Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque).
E	getFirst()
Retrieves, but does not remove, the first element of this deque.
E	getLast()
Retrieves, but does not remove, the last element of this deque.
Iterator<E>	iterator()
Returns an iterator over the elements in this deque in proper sequence.
boolean	offer(E e)
Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and false if no space is currently available.
boolean	offerFirst(E e)
Inserts the specified element at the front of this deque unless it would violate capacity restrictions.
boolean	offerLast(E e)
Inserts the specified element at the end of this deque unless it would violate capa


}
