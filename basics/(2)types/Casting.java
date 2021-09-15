//there is two type of casting in java implicit and explicit
//

public class Casting
{
	public static void main(String [] args)
	{
		// implicit casting 
		// byte -> short -> int -> long -> float -> double
		// implicit casting work as soon as the data preserve.

		byte a = 10;
		short b = (short)a;
		int c = (int)b;
		long d = (long)c;
		float e = (float)b;
		double f = (double)e;
		//explicit casting 

		String name = "1";
		// the name not equals to one it is ascii represention of one so to convert .
		// we use rapper class .
		System.out.println(Integer.valueOf(name));	
	}
}