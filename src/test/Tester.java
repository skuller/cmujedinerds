package test;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hi = new HelloWorld ();
		System.out.println(hi.getHello("Jedi's!!"));
		
		DansTest nextTest = new DansTest("hello people dans test");
		System.out.println(nextTest.getWords());
		DansTest petchTest = new DansTest("hello people petchs test");
		System.out.println(petchTest.getWords());
	}

}
