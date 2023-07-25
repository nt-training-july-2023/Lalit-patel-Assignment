
class Test {

	// Static variable
	static int i;
	// Non-static variable
	int j;

	//  Static block
	static
	{
		i = 10;
		System.out.println("static block called ");
	}

	// Constructor calling
	Test() { System.out.println("Constructor called"); }
}


class StaticBlock2 {
	public static void main(String args[])
	{

		Test t1 = new Test();
		Test t2 = new Test();
	}
}
