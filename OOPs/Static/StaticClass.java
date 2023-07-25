
// Implement Static and Non-static Classes

class OuterClass {

	// Input string
	private static String msg = "Lalit Patel";

	// Static nested class
	public static class NestedStaticClass {

		public void printMessage()
		{
			System.out.println("Message from nested static class: " + msg);
		}
	}

	// Non-static nested class -
	// also called Inner class
	public class InnerClass {
		public void display()
		{
			System.out.println("Message from non-static nested class: "+ msg);
		}
	}
}



class GFG {

	
	public static void main(String args[])
	{

		//static nested class can be instantiated without instantiation of outerclass
		OuterClass.NestedStaticClass printer= new OuterClass.NestedStaticClass();
		printer.printMessage();

		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner= outer.new InnerClass();
		inner.display();

	}
}
