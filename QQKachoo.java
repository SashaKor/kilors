import java.util.LinkedList; 

public class QQKachoo<Card> implements Deque<Card>  {

    public LinkedList<Card> test; 

    public QQKachoo() {test = new LinkedList<Card>();}

    public String toString() {return test.toString();}

    // Inserts the specified element at the front of this deque if it is possible to 
    // do so immediately without violating capacity restrictions.
    public void	addFirst(Card e) {test.addFirst(e);}

    // Inserts the specified element at the end of this deque if it is possible to 
    // do so immediately without violating capacity restrictions.
    public void	addLast(Card e) {test.addLast(e);}

    // Returns the number of elements in this deque.
    public int size() {return test.size();}

    // Retrieves and removes the first element of this deque.
    public Card	removeFirst() {return test.removeFirst();} 

    // Retrieves and removes the last element of this deque.
    public Card	removeLast() {return test.removeLast();}

    // Retrieves, but does not remove, the first element of this deque.
    public Card getFirst() {return test.getFirst();}

    // Retrieves, but does not remove, the last element of this deque.
    public Card getLast() {return test.getLast();}

    /*
    // Inserts the specified element at the front of this deque unless it would violate capacity restrictions.
    public boolean offerFirst(Card e) { return test.offerFirst(e); }

    // Retrieves and removes the first element of this deque, or returns null if this deque is empty.
    public Card	pollFirst() { return test.pollFirst(); }

    // Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
    public Card peekFirst() { return test.peekFirst(); }  

    // Inserts the specified element at the end of this deque unless it would violate capacity restrictions. 
    public boolean offerLast(Card e) { return test.offerLast(e); }

    // Retrieves and removes the last element of this deque, or returns null if this deque is empty.
    public Card	pollLast() { return test.pollLast(); }

    // Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
    public Card	peekLast() { return test.peekLast(); }

    // Inserts the specified element into the queue represented by this deque 
    // (in other words, at the tail of this deque) if it is possible to do so 
    // immediately without violating capacity restrictions, returning true upon success 
    // and throwing an IllegalStateException if no space is currently available.
    public boolean add(Card e) { return test.add(e); }

    // Inserts the specified element into the queue represented by this deque 
    //(in other words, at the tail of this deque) if it is possible to do so immediately 
    // without violating capacity restrictions, returning true upon success and false if 
    // no space is currently available.
    public boolean offer(Card e) { return test.offer(e); }

    // Retrieves and removes the head of the queue represented by this deque 
    //(in other words, the first element of this deque).
    public Card	remove() { return test.remove(); }

    // Retrieves and removes the head of the queue represented by this deque 
    //(in other words, the first element of this deque), or returns null if this deque is empty.
    public Card	poll() { return test.poll(); }

    // Retrieves, but does not remove, the head of the queue represented by this deque 
    //(in other words, the first element of this deque).
    public Card element() { return test.element(); } 

    // Retrieves, but does not remove, the head of the queue represented by this deque 
    //(in other words, the first element of this deque), or returns null if this deque is empty.
    public Card	peek() { return test.peek(); } 

    //Pops an element from the stack represented by this deque.
    public Card	pop() { return test.pop(); }

    // Pushes an element onto the stack represented by this deque 
    // (in other words, at the head of this deque) if it is possible to do so immediately 
    // without violating capacity restrictions, throwing an IllegalStateException if
    // no space is currently available.
    public void	push(Card e) { return test.push(e); }

    // Returns true if this deque contains the specified element.
    public boolean contains(Object o) { return test.contains(o); }

    // Returns an iterator over the elements in this deque in reverse sequential order.
    public Iterator<Card> descendingIterator() { return test.descendingIterator(); } 

    // Returns an iterator over the elements in this deque in proper sequence.
    public Iterator<Card> iterator() { return test.iterator(); } 

    // Removes the first occurrence of the specified element from this deque.
    public boolean remove(Object o) { return test.remove(o); } 

    // Removes the first occurrence of the specified element from this deque.
    public boolean removeFirstOccurrence(Object o) { return test.removeFirstOccurrence(o); }

    // Removes the last occurrence of the specified element from this deque.
    public boolean removeLastOccurrence(Object o) { return test.removeLastOccurrence(o); } */

}
