public class DequeTester{
	
    public static void main(String[] args) { 
		QQKachoo<String> _doge = new QQKachoo<String>();

		_doge.addFirst("waow");
		_doge.addFirst("amaz");
		_doge.addFirst("nois");
	        
		System.out.println("values added using addFirst()");
		System.out.println(_doge.toString());

		_doge.addLast("kewl");
		_doge.addLast("heck");
		_doge.addLast("boop");

		System.out.println("values added using addLast()");
		System.out.println(_doge.toString());

		_doge.removeLast();

		System.out.println("value removed using removeLast()");
		System.out.println(_doge.toString());

		_doge.removeFirst();

		System.out.println("value removed using removeFirst()");
		System.out.println(_doge.toString());

		System.out.println("testing size()");
		System.out.println("size is: " + _doge.size());
		System.out.println("testing getFirst()");
		System.out.println("first value is: " + _doge.getFirst());
		System.out.println("testing getLast()");
		System.out.println("last value is: " + _doge.getLast());
	}
}