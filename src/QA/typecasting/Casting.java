package QA.typecasting;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d= 199.99;
		long l= (long) d;
		int i= (int) l;
		float f= i;
		short s= (short) f;
	System.out.println("the double value : " + d);
	System.out.println("the long value : " + l);
	System.out.println("the integer value : " + i);
	System.out.println("the float value : " + f);
	System.out.println("the short value : " + s);
		
	}

}
