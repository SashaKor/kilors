
public interface Deque<Card> {

    public boolean add(Card e); 
//Inserts the specified element into the queue represented by this deque 
//(in other words, at the tail of this deque) if it is possible to do so 
//immediately without violating capacity restrictions, returning true upon success 
//and throwing an IllegalStateException if no space is currently available.

    public void	addFirst(Card e); 
//Inserts the specified element at the front of this deque if it is possible to 
//do so immediately without violating capacity restrictions.

    public void	addLast(Card e); 
//Inserts the specified element at the end of this deque if it is possible to 
//do so immediately without violating capacity restrictions.

    public boolean contains(Object o); 
//Returns true if this deque contains the specified element.
    public Iterator<Card> descendingIterator(); 
//Returns an iterator over the elements in this deque in reverse sequential order.
    public Card element(); 
//Retrieves, but does not remove, the head of the queue represented by this deque 
//(in other words, the first element of this deque).
    public Card getFirst(); 
//Retrieves, but does not remove, the first element of this deque.
    public Card getLast(); 
//Retrieves, but does not remove, the last element of this deque.
    public Iterator<Card> iterator(); 
//Returns an iterator over the elements in this deque in proper sequence.
    public boolean offer(Card e); 
//Inserts the specified element into the queue represented by this deque 
//(in other words, at the tail of this deque) if it is possible to do so immediately 
//without violating capacity restrictions, returning true upon success and false if 
//no space is currently available.
    public boolean offerFirst(Card e); 
//Inserts the specified element at the front of this deque unless it would violate capacity restrictions.
    public boolean offerLast(Card e); 
//Inserts the specified element at the end of this deque unless it would violate capacity restrictions. 

}
