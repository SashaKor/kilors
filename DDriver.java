//kilors (Aleksandra K, Susan L, Angela T.)
//APCS2 pd2
//QQKachoo Driver

public class DDriver{

    public static void main(String[] args) { 
	//instantiate a deque
	QQKachoo<String> test1 = new QQKachoo<String>();

	//start essential methods testing;
	//add values to front end
	test1.addFirst("0");
	test1.addFirst("1");
        
	//print out so far
	System.out.println("-------------------");
	System.out.println("values added using addFirst()");
	System.out.println(test1.toString());
	System.out.println("-------------------");

	//add values to the rear end 
	test1.addLast("2");
	test1.addLast("3");

	//print out again
	System.out.println("-------------------");
	System.out.println("values added using addLast()");
	System.out.println(test1.toString());
	System.out.println("-------------------");

	//remove value from rear end
	test1.removeLast();

	//print out yet again
	System.out.println("-------------------");
	System.out.println("value removed using removeLast()");
	System.out.println(test1.toString());
	System.out.println("-------------------");

	//remove value from front end
	test1.removeFirst();

	//again and again
	System.out.println("-------------------");
	System.out.println("value removed using removeFirst()");
	System.out.println(test1.toString());
	System.out.println("-------------------");

	//testing size, getFirst(), and getLast()
	System.out.println("-------------------");
	System.out.println("testing size()");
	System.out.println("size is: " + test1.size());
	System.out.println("testing getFirst()");
	System.out.println("first value is: " + test1.getFirst());
	System.out.println("testing getLast()");
	System.out.println("last value is: " + test1.getLast());
	System.out.println("-------------------");

	//end essential methods testing
	

    }
}
