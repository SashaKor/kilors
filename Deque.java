public interface Deque<Card> {

//Inserts the specified element at the front of this deque if it is possible to 
//do so immediately without violating capacity restrictions.
    public void	addFirst(Card e); 

//Inserts the specified element at the end of this deque if it is possible to 
//do so immediately without violating capacity restrictions.
    public void	addLast(Card e); 

// /Returns the number of elements in this deque.
    public int size(); 

//Retrieves and removes the first element of this deque.
    public Card	removeFirst(); 

//Retrieves and removes the last element of this deque.
    public Card	removeLast(); 

//Retrieves, but does not remove, the first element of this deque.
    public Card getFirst(); 

//Retrieves, but does not remove, the last element of this deque.
    public Card getLast(); 

//Inserts the specified element at the front of this deque unless it would violate capacity restrictions.
    public boolean offerFirst(Card e); 

//Retrieves and removes the first element of this deque, or returns null if this deque is empty.
    public Card	pollFirst(); 

//Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
    public Card peekFirst(); 

//Inserts the specified element at the end of this deque unless it would violate capacity restrictions. 
    public boolean offerLast(Card e); 

//Retrieves and removes the last element of this deque, or returns null if this deque is empty.
    public Card	pollLast(); 

//Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
    public Card	peekLast();

//Inserts the specified element into the queue represented by this deque 
//(in other words, at the tail of this deque) if it is possible to do so 
//immediately without violating capacity restrictions, returning true upon success 
//and throwing an IllegalStateException if no space is currently available.
    public boolean add(Card e); 

//Inserts the specified element into the queue represented by this deque 
//(in other words, at the tail of this deque) if it is possible to do so immediately 
//without violating capacity restrictions, returning true upon success and false if 
//no space is currently available.
    public boolean offer(Card e); 

 //Retrieves and removes the head of the queue represented by this deque 
//(in other words, the first element of this deque).
    public Card	remove(); 

//Retrieves and removes the head of the queue represented by this deque 
//(in other words, the first element of this deque), or returns null if this deque is empty.
    public Card	poll(); 

//Retrieves, but does not remove, the head of the queue represented by this deque 
//(in other words, the first element of this deque).
    public Card element(); 

//Retrieves, but does not remove, the head of the queue represented by this deque 
//(in other words, the first element of this deque), or returns null if this deque is empty.
    public Card	peek();  

//Pops an element from the stack represented by this deque.
    public Card	pop(); 

//Pushes an element onto the stack represented by this deque 
//(in other words, at the head of this deque) if it is possible to do so immediately 
//without violating capacity restrictions, throwing an IllegalStateException i
//f no space is currently available.
    public void	push(Card e); 

//Returns true if this deque contains the specified element.
    public boolean contains(Object o); 

//Returns an iterator over the elements in this deque in reverse sequential order.
    public Iterator<Card> descendingIterator(); 

//Returns an iterator over the elements in this deque in proper sequence.
    public Iterator<Card> iterator(); 

//Removes the first occurrence of the specified element from this deque.
    public boolean remove(Object o); 

//Removes the first occurrence of the specified element from this deque.
    public boolean removeFirstOccurrence(Object o); 

//Removes the last occurrence of the specified element from this deque.
    public boolean	removeLastOccurrence(Object o); 
}
