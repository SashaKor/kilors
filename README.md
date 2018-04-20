# Team kilors
# Angela Tom, Aleksandra Koroza, Susan Lin

We will use (doubly-linked) node-based architecture because it will have a faster runtime than the other choices: array-based or ArrayList-based. For methods such as remove and add-at-index, the ArrayList and array structure would require iterating across the entire collection and creating a new collection that reflects these changes. An array-based structure was also not considered because of its limitations on collection size. Although there can be size-restricted deque implementations, our structure should support deques with no fixed size limits (as specified by the java api). Our team eventually settled on a LinkedList based architecture due to runtime efficiency and ease of programming (a subjective assessment).

# Ordered/Prioritized To-Do List

1. Essential Methods (throws exception if method fails)
These methods we will implement first according to our development plan. There is a lot of cross-over among the deque interface methods and the following methods are, at its core, all that is necessary to implement both the stack and queue structures.

- addFirst(E e)
- addLast(E e)
- size()
- removeFirst()
- removeLast()
- getFirst()
- getLast()

2. Alternatives to essential methods (returns values like null or false if method fails)

- offerFirst(E e) - similar to addFirst
- pollFirst() - similar to removeFirst
- peekFirst() - similar to getFirst
- offerLast(E e) - similar to addLast
- pollLast() - similar to removeLast
- peekLast() - similar to getLast

Queue method alternatives (to be implemented if time permits)
- add(E e) - same as addLast
- offer(E e) - same as offerLast, which is similar to addLast
- remove() - same as removeLast
- poll() - same as pollFirst, which is similar to removeFirst
- element() - same as getFirst 
- peek() - same as peekFirst, which is similar to getFirst

Stack method alternatives (to be implemented if time permits)
- push(E e) - same as addFirst(E e)
- pop() - same as removeFirst()
- peek() - same as peekFirst, which is similar to getFirst

3. Extra non-essentials methods (Both queue and stack structures can be implemented without these)

- contains(Object o)
- descendingIterator()
- iterator()
- remove(Object o)
- removeFirstOccurence(Object o)
- removeLastOccurence(Object o)

# Summary of Development Plan

Our group has chosen and implemented the methods that we thought were necessary for the deque, queue, and stack structures. We used LinkedList as our container, and used the imported methods to facilitate our work. This is reflected in our Deque interface, as well as our driver file (DDdrive.java).

What is left to do is to possibly implement other methods that are referenced on the API page and to discuss the uses of Deques as a structure.














